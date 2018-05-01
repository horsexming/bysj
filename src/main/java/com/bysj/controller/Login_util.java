package com.bysj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bysj.bean.User;

@Controller
public class Login_util {
	@RequestMapping("/user_help")
	public String user_help() {
		return "/other/User_help";
	}
	
	@RequestMapping("/user_helps")
	public String user_helps() {
		return "/other/User_helps";
	}
	@RequestMapping("/user_out")
	public String user_out(HttpSession session) {
		if(session.getAttribute("user")!=null) {
			session.removeAttribute("user");
		}
		if(session.getAttribute("business")!=null) {
			session.removeAttribute("business");
		}				
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/user_index")
	public String user_index() {		
		return "login";
	}
	@RequestMapping("/user_gouout")
	public String user_gouout() {
		return "redirect:/index.jsp";
	}

}
