package com.bysj.controller;



import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.Orders;
import com.bysj.bean.User;
import com.bysj.bean.Xgoods;
import com.bysj.model.BusinessFile;
import com.bysj.servies.BusinessService;
import com.bysj.servies.GoodsService;
import com.bysj.servies.OrderService;
import com.bysj.servies.Userservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.api.Session;

@Controller
public class businController {
	@Autowired
	Userservice userservice;
	@Autowired
	BusinessService businessService;
	@Autowired
	OrderService orderService;
	@Autowired
	GoodsService goodsService;
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
            String uuid = UUID.randomUUID().toString().substring(0, 5);
            String filename = Gpicture.getOriginalFilename()+uuid;
            Gpicture.transferTo(new File(path+"static/image/"+filename));
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
	
	//通过姓名查询用户信息
	@RequestMapping("/selsect_business/{username}")
	public String selsect_business(@PathVariable("username")String username,Model model) {
		model.addAttribute("Business_message",businessService.getBusinessByname(username));
		System.out.println(businessService.getBusinessByname(username).getSex());
		return "/business/selsect_business";
	}
	//修改个人信息跳转
	@RequestMapping("/business_update/{username}")
	public String update_business(@PathVariable("username")String username,Model model,HttpSession session) {
		
		
		model.addAttribute("Business_message",businessService.getBusinessByname(username));
		session.setAttribute("bname", username);
		return "/business/update_business";
	}
	
	//修改个人信息
	@RequestMapping(value="/business_update" ,method=RequestMethod.POST)
	public String update_business(Business business,Model model,HttpSession session) {
		String buname = session.getAttribute("bname").toString();
		System.out.println(buname);
		businessService.business_update(business);
		model.addAttribute("Business_message",businessService.getBusinessByname(buname));
		
		return "/business/selsect_business";
	}
	//查询订单信息
	
	@RequestMapping("/business_selectorder/{username}")
	private String user_select_order(@PathVariable("username")String username,Model model
			,@RequestParam(value="pn",defaultValue="1")Integer pn,HttpSession session) {	
		PageHelper.startPage(pn, 3);
		List<Orders> list =orderService.getorders_bybusiness(username);
		PageInfo<Orders>page = new PageInfo<Orders>(list,5);
		model.addAttribute("order_message",list);
		model.addAttribute("pageInfo", page);
		session.setAttribute("businessusername", username);
		return "/business/business_selectorder";
	}
	
	//查询订单信息分页
		@RequestMapping("/select_business_order")
		public String select_goods_bynamepage(@RequestParam(value="pn",defaultValue="1")Integer pn
				,Model model,HttpSession session) {
			PageHelper.startPage(pn, 3);
			String username = session.getAttribute("businessusername").toString();
			System.out.println(username);
			List<Orders> list =orderService.getorders_bybusiness(username);
			System.out.println(list);
			PageInfo<Orders>page = new PageInfo<Orders>(list,5);
			model.addAttribute("pageInfo", page);
			model.addAttribute("order_message",list);
			return "/business/business_selectorder";
		}
		
		//判断用户是否存在
		
		@ResponseBody 
		@RequestMapping(value = "/check_businessName", produces = "application/json; charset=utf-8")
			public Integer checkUserName(String username)
					throws IOException {
			System.out.println(username);
			System.out.println(businessService.findEmpByName(username));
				return  businessService.findEmpByName(username);
				

			}
		//用户注册
		@RequestMapping(value="/Business_Registers", method=RequestMethod.POST)
		public String userShow(Business business,Model model) {	
			businessService.add_business(business);
			model.addAttribute("user", business);
			return "userLogin";
		}
		
		//商品下架
		@RequestMapping("/out_bdoods/{id}")
		public String out_bgoods(@PathVariable("id")Integer id) {
			Bgoods bgoods = goodsService.getBgoods(id);
			goodsService.add_xgoods(bgoods);
			goodsService.out_bgoods(id);
			return "redirect:/Bpage";
		}
		
		//下架商品管理
		@RequestMapping("/business_xgoods/{username}")
		public String business_xgoods(@PathVariable("username")String username,Model model
				,@RequestParam(value="pn",defaultValue="1")Integer pn,HttpSession session) {
			System.out.println(username);
			PageHelper.startPage(pn, 3);
			List<Xgoods> xgoods = goodsService.select_xgoods(username); 
			PageInfo<Xgoods>page = new PageInfo<Xgoods>(xgoods,3);
			session.setAttribute("Xusername", username);
			model.addAttribute("pageInfo", page);
			model.addAttribute("xgoods",xgoods);
			return "/business/business_xgoods";		
			
		}
		//下架商品分页
		@RequestMapping("/select_Xdoods_page")
		public String select_Xdoods_page(@RequestParam(value="pn",defaultValue="1")Integer pn
				,Model model,HttpSession session) {
			PageHelper.startPage(pn, 3);
			String username = session.getAttribute("Xusername").toString();
			List<Xgoods> xgoods = goodsService.select_xgoods(username); 
			PageInfo<Xgoods>page = new PageInfo<Xgoods>(xgoods,3);
			model.addAttribute("pageInfo", page);
			model.addAttribute("xgoods",xgoods);
			return "/business/business_xgoods";
		}
		
		//删除下架商品
		@RequestMapping("/delete_xboods/{id}")		
		public String delete_xboods(@PathVariable("id")Integer id) {
			goodsService.delete_xgoods(id);
			return "redirect:/select_Xdoods_page";
		}
		
		//下架商品上架
		
		
		
		
}