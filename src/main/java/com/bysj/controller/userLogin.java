package com.bysj.controller;


import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bysj.bean.User;
import com.bysj.servies.Userservice;

@Controller
public class userLogin {
	@Autowired
	Userservice userservice;
	
	@RequestMapping(value="/logins", method=RequestMethod.POST )
	public String UserLogin(@RequestParam String username ,@RequestParam String password,@RequestParam Integer ra
			,Model model) {
		if(ra==1) {
			List<User> list=userservice.getUser(username, password);
			if (list!=null) {
				model.addAttribute("user", list);
				return "login";
			}else {
				
				model.addAttribute("user", "用户名或密码错误");
				return "index";
			}
			
		}
		else {
			
			List<User> list=userservice.getUser(username, password);
			if (list!=null) {
				model.addAttribute("user", list);
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