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
import com.bysj.bean.Orders;
import com.bysj.bean.User;
import com.bysj.servies.BusinessService;
import com.bysj.servies.OrderService;
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
	@Autowired
	OrderService orderService;
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
				
				model.addAttribute("user", "用户名或密码错误");
				return "userLogin";
			}
			
		}else {
			
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
				
				model.addAttribute("user", "用户名或密码错误");
				return "userLogin";
			}
		}
		
		
	}
	
	//跳转到登录页
	@RequestMapping("/user_Login")
	public String user_Logins(){
		return "userLogin";
	}
	//跳转到登录页
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
	
	//注册选择

	@RequestMapping(value="/registers", method=RequestMethod.GET)
	public String register() {
		
		return "register";
	}
	//用户注册跳转
	@RequestMapping(value="/userRegisters", method=RequestMethod.GET)
	public String userRegisters() {
		
		return "userRegister";
	}
	//商家注册跳转
	@RequestMapping(value="/shopRegisters", method=RequestMethod.GET)
	public String shopRegisters() {
		
		return "shopRegisters";
	}
	//用户注册
	@RequestMapping(value="/shopRegisters", method=RequestMethod.POST)
	public String userShow(User user,Model model) {	
		userservice.addUser(user);
		model.addAttribute("user", user);
		return "userLogin";
	}
	
	//判断用户是否存在
	
	@ResponseBody 
	@RequestMapping(value = "/checkName", produces = "application/json; charset=utf-8")
		public Integer checkUserName(String username)
				throws IOException {
		System.out.println(username);
		System.out.println(userservice.findEmpByName(username));
			return  userservice.findEmpByName(username);
			

		}
	
	//跳转到个人信息
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
	
	//更新用户信息\
	@RequestMapping(value="/User_update",method=RequestMethod.POST)
	public String User_update(User user,HttpSession session) {
		userservice.user_update(user);
		User u = (User) session.getAttribute("usermessage");
		String username = u.getUsername();		
		session.setAttribute("usermessage", userservice.selectUserBy_Name(username));
		
		return "/user/user_message";
	}
	
	//查询订单信息
	@RequestMapping("/user_select_order")
	private String user_select_order(@RequestParam("username")String username,Model model) {		
		List<Orders> list =orderService.getorders_byusername(username);
		model.addAttribute("order_message",list);
		return "/user/user_select_order";
	}

}