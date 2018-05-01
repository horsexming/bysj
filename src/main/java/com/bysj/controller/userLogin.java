package com.bysj.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.User;
import com.bysj.servies.BusinessService;
import com.bysj.servies.Userservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.api.Session;

@Controller
public class userLogin {
	@Autowired
	Userservice userservice;
	@Autowired
	BusinessService businessService;
	
	@RequestMapping(value="/logins", method=RequestMethod.POST )
	public String UserLogin(@RequestParam String username ,@RequestParam(value="pn",defaultValue="1")Integer pn
			,@RequestParam String password,@RequestParam Integer ra
			,Model model,Map<Object,Object> map,HttpSession session) {
		if(ra==1) {
			User user = userservice.getUser(username, password);
			
			
			if (user!=null) {
				model.addAttribute("user", user);
				session.setAttribute("users", user);
				return "login";
			}else {
				
				model.addAttribute("user", "�û������������");
				return "userLogin";
			}
			
		}else {
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			
			Business business = businessService.getbusiness(username, password);
			
			if (business!=null) {
				PageHelper.startPage(pn, 5);
				List<Bgoods>list = businessService.getBgoods(business.getUsername());
				PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
				model.addAttribute("pageInfo", page);
				model.addAttribute("Budoods",list);
				session.setAttribute("business", business);
				session.setAttribute("buname", business.getUsername());
				return "businessLogin";
			}else {
				
				model.addAttribute("user", "�û������������");
				return "userLogin";
			}
		}
		
		
	}
	
	//��ת����¼ҳ
	@RequestMapping("/user_Login")
	public String user_Logins(){
		return "userLogin";
	}
	//��ת����¼ҳ
	@ResponseBody
	@RequestMapping(value="/user_Loginvalidate",produces = "application/json; charset=utf-8")
	public Integer user_Loginvalidate(HttpSession session){
		User user = (User) session.getAttribute("users");
		Business business = (Business) session.getAttribute("business");
		int i;
		if(user!=null||business!=null) {
			i=1;
			return i;
		}else {
			i=2;
			return i;			
		}
			
	}
	
	//ע��ѡ��

	@RequestMapping(value="/registers", method=RequestMethod.GET)
	public String register() {
		
		return "register";
	}
	//�û�ע����ת
	@RequestMapping(value="/userRegisters", method=RequestMethod.GET)
	public String userRegisters() {
		
		return "userRegister";
	}
	//�̼�ע����ת
	@RequestMapping(value="/shopRegisters", method=RequestMethod.GET)
	public String shopRegisters() {
		
		return "shopRegisters";
	}
	
	@RequestMapping(value="/shopRegisters", method=RequestMethod.POST)
	public String userShow(User user,Model model) {	
		userservice.addUser(user);
		model.addAttribute("user", user);
		return "index";
	}
	
	//�ж��û��Ƿ����
	
	@ResponseBody 
	@RequestMapping(value = "/checkName", produces = "application/json; charset=utf-8")
		public Integer checkUserName(String username)
				throws IOException {
		/*Integer i = new Integer(1);
		return i;*/
		System.out.println(username);
		System.out.println(userservice.findEmpByName(username));
			return  userservice.findEmpByName(username);
			

		}
	
	//��ת��������Ϣ
	@RequestMapping("/User_message")
	public String User_message(@RequestParam("username")String username,HttpSession session) {
		User user = userservice.selectUserBy_Name(username);
		session.setAttribute("usermessage",user);
		return "/user/user_message";
	}
	@RequestMapping("/User_xiugai")
	public String User_xiugai(@RequestParam("username")String username,Map<Object,Object> map) {
		User user = userservice.selectUserBy_Name(username);
		map.put("usermessage", user);
		return "/user/User_xiugai";
	}
	
	//�����û���Ϣ\
	@RequestMapping(value="/User_update",method=RequestMethod.POST)
	public String User_update(User user,HttpSession session) {
		userservice.user_update(user);
		User u = (User) session.getAttribute("usermessage");
		String username = u.getUsername();		
		session.setAttribute("usermessage", userservice.selectUserBy_Name(username));
		
		return "/user/user_message";
	}

}