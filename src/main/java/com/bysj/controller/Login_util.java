package com.bysj.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.User;
import com.bysj.servies.BusinessService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class Login_util {
	@Autowired
	BusinessService businessService;
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
		if(session.getAttribute("users")!=null) {
			session.removeAttribute("users");
		}
		if(session.getAttribute("business")!=null) {
			session.removeAttribute("business");
		}				
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/ubindex")
	public String ub_index(HttpSession session) {
		
			return "redirect:/index.jsp";
		
	}
	
	@RequestMapping("/user_index")
	public String user_index(HttpSession session) {
		
			return "login";
		
	}
	@RequestMapping("/user_gouout")
	public String user_gouout() {
		return "redirect:/index.jsp";
	}
	//…Ãº“∑µªÿ
	@RequestMapping("/Business_index")
	public String Business_index(@RequestParam(value="pn",defaultValue="1")Integer pn,
			HttpSession session,Model model) {	
		String buname = session.getAttribute("buname").toString();
		System.out.println(buname);
			PageHelper.startPage(pn, 5);
			List<Bgoods>list = businessService.getBgoods(buname);
			PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
			model.addAttribute("pageInfo", page);
			model.addAttribute("Budoods",list);
			Business business = (Business) session.getAttribute("business");
			session.setAttribute("business", business);
			session.setAttribute("buname", business.getUsername());
		return "businessLogin";
	}

}
