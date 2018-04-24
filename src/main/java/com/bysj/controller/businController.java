package com.bysj.controller;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.User;
import com.bysj.model.BusinessFile;
import com.bysj.servies.BusinessService;
import com.bysj.servies.Userservice;

@Controller
public class businController {
	@Autowired
	Userservice userservice;
	@Autowired
	BusinessService businessService;
	@RequestMapping("/addGoods")
	public String addGoods() {
		
		return "addGoods";
	}
	
	@RequestMapping(value="/addGoods",method=RequestMethod.POST)
	public String BusinessaddGoods(@RequestParam("Gpicture")MultipartFile Gpicture,BusinessFile businessFile,
			HttpServletRequest request,HttpSession session,Map<Object,Object> map) throws Exception{
		//����ļ���Ϊ�գ�д���ϴ�·��
		System.out.println("000000"+businessFile.getGprice());
        if(!Gpicture.isEmpty()) {;
            //�ϴ��ļ�·��
            String path = request.getContextPath()+"/static/goods";
            System.out.println(path);
            //�ϴ��ļ���
            String filename = Gpicture.getOriginalFilename();
           /* File filepath = new File(path,filename);
            //�ж�·���Ƿ���ڣ���������ھʹ���һ��
            if (!filepath.getParentFile().exists()) { 
                filepath.getParentFile().mkdirs();
            }*/
            //���ϴ��ļ����浽һ��Ŀ���ļ�����
           InputStream inputStream = Gpicture.getInputStream();
           System.out.println(inputStream.available());
           byte[] buffer = new byte[inputStream.available()];
           OutputStream outputStream = new FileOutputStream(path + "/"+ filename);
           int len;
           while((len = inputStream.read(buffer)) != -1) {
        	   outputStream.write(buffer, 0, len);
           }
           inputStream.close();
           outputStream.close();
           Gpicture.transferTo(new File(path + "/"+ filename));
            Bgoods bgoods = new Bgoods();
            bgoods.setGname(businessFile.getGname());
            bgoods.setBusiness(session.getAttribute("buname").toString());
            bgoods.setGpicture(filename);
            System.out.println("000000"+businessFile.getGprice());
            bgoods.setGprice(businessFile.getGprice());
            bgoods.setGumber(businessFile.getGumber());
            bgoods.setGcategory(businessFile.getGcategory());
            businessService.addGoods(bgoods);
            map.put("login", "aa");
			map.put("Budoods",businessService.getBgoods(session.getAttribute("buname").toString()));
            return "businessLogin";
        } else {
            return "error";
        }
		
	}
	

	

}