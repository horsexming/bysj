package com.bysj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
			User user =userservice.getUser(username, password);
			if (user!=null) {
				model.addAttribute("user", user);
				return "login";
			}else {
				
				model.addAttribute("user", "用户名或密码错误");
				return "index";
			}
			
		}
		else {
			
			User user =userservice.getUser(username, password);
			if (user!=null) {
				model.addAttribute("user", user);
				return "login";
			}else {
				
				model.addAttribute("user", "用户名或密码错误");
				return "index";
			}
		}
		
		
	}

}