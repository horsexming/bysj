package com.bysj.controller;


import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bysj.bean.Bgoods;
import com.bysj.bean.User;
import com.bysj.servies.Userservice;

@Controller
public class userLogin {
	@Autowired
	Userservice userservice;
	
	@RequestMapping(value="/logins", method=RequestMethod.POST )
	public String UserLogin(@RequestParam String username ,@RequestParam String password,@RequestParam Integer ra
			,Model model,Map<Object,Object> map) {
		if(ra==1) {
			User user = userservice.getUser(username, password);
			Bgoods bgoods = userservice.getBgoods(1);
			
			if (user!=null) {
				model.addAttribute("user", user);
				map.put("bgoods", bgoods);
				System.out.println(bgoods.getGname());
				return "login";
			}else {
				
				model.addAttribute("user", "用户名或密码错误");
				return "index";
			}
			
		}
		else {
			
			User user = userservice.getUser(username, password);
			if (user!=null) {
				model.addAttribute("user", user);
				return "login";
			}else {
				
				model.addAttribute("user", "用户名或密码错误");
				return "index";
			}
		}
		
		
	}
	@RequestMapping(value="/registers", method=RequestMethod.GET)
	public String register() {
		
		return "register";
	}
	
	@RequestMapping(value="/userRegisters", method=RequestMethod.GET)
	public String userRegisters() {
		
		return "userRegister";
	}
	
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

}