package com.bysj.controller;



import java.io.File;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;

import com.bysj.model.BusinessFile;
import com.bysj.servies.BusinessService;
import com.bysj.servies.Userservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class businController {
	@Autowired
	Userservice userservice;
	@Autowired
	BusinessService businessService;
	//点击商品添加跳转
	@RequestMapping("/addGoods")
	public String addGoods() {		
		return "addGoods";
	}
	//商品添加
	@RequestMapping(value="/addGoods",method=RequestMethod.POST)
	public String BusinessaddGoods(@RequestParam("Gpicture")MultipartFile Gpicture,BusinessFile businessFile,
			HttpServletRequest request,HttpSession session,Model model
			,@RequestParam(value="pn",defaultValue="1")Integer pn) throws Exception{
		//如果文件不为空，写入上传路径
        if(!Gpicture.isEmpty()) {;
            //上传文件路径
            String path = request.getServletContext().getRealPath("/");
            System.out.println(path);
            //上传文件名
            String filename = Gpicture.getOriginalFilename();
            Gpicture.transferTo(new File(path+"image/"+filename));
            Bgoods bgoods = new Bgoods();
            bgoods.setGname(businessFile.getGname());
            bgoods.setBusiness(session.getAttribute("buname").toString());
            bgoods.setGpicture(filename);
            System.out.println("000000"+businessFile.getGprice());
            bgoods.setGprice(businessFile.getGprice());
            bgoods.setGumber(businessFile.getGumber());
            bgoods.setGcategory(businessFile.getGcategory());
            businessService.addGoods(bgoods);
            Business business = (Business) session.getAttribute("business");
    		System.out.println(business.getUsername());
    		PageHelper.startPage(pn, 5);
    		List<Bgoods>list = businessService.getBgoods(business.getUsername());
    		PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
    		model.addAttribute("pageInfo", page);
    		model.addAttribute("Budoods",list);
    		model.addAttribute("login","aa");	
           /* map.put("login", "aa");*/
			/*map.put("Budoods",businessService.getBgoods(session.getAttribute("buname").toString()));*/
            return "businessLogin";
        } else {
            return "error";
        }
		
	}
	
	//商品翻页跳转
	@RequestMapping("/Bpage")
	public String BusinessPage(@RequestParam(value="pn",defaultValue="1")Integer pn
			,HttpSession session,Model model) {
		Business business = (Business) session.getAttribute("business");
 		System.out.println(business.getUsername());
 		PageHelper.startPage(pn, 5);
 		List<Bgoods>list = businessService.getBgoods(business.getUsername());
 		PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
 		model.addAttribute("pageInfo", page);
 		model.addAttribute("Budoods",list);
		return "businessLogin";
	}

	

}