package com.bysj.controller;

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

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.Orders;
import com.bysj.bean.Shop;
import com.bysj.bean.User;
import com.bysj.servies.BusinessService;
import com.bysj.servies.GoodsService;
import com.bysj.servies.OrderService;
import com.bysj.servies.Userservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class goodsController {
	@Autowired
	GoodsService goodsService;
	@Autowired
	OrderService orderService;
	@Autowired
	Userservice userservice;
	@Autowired
	BusinessService businessService;
	/*�õ���Ʒ*/
	@RequestMapping(value="/goods/{id}")
	public String getGoods(@PathVariable("id") int id ,Map<Object, Object>map,HttpSession session) {
		
		map.put("goods",goodsService.getBgoods(id));
		return "showgoods";
	}
	
	//��ȡ���ﳵ��Ʒ
	@RequestMapping("/shopping/{id}")
	public String shopping(@PathVariable("id")int id ,Map<Object, Object>map,HttpSession session) {
		
		List<Shop>list = goodsService.getShop(id);
		map.put("shop", list);
		session.setAttribute("id",id);
		if(list.isEmpty()) {
			map.put("Shop_message", "����û����ӱ��������ﳵ");
		}
		return "shopping";
	}
	
	//ɾ������С����Ʒ
	@RequestMapping("/Deletegoods/{id}")
	public String deletedshop(@PathVariable("id")int id,Map<Object, Object>map,HttpSession session) {
		goodsService.deleteShop(id);
		List<Shop>list = goodsService.getShop((int)(session.getAttribute("id")));
		map.put("shop", list);
		return"shopping";
	}
	
	//������Ʒ
	@RequestMapping("/Buygoods/{Gpicture}")
	public String Buy(@PathVariable("Gpicture")String Gpicture,Map<Object, Object>map) {	
		System.out.println(Gpicture);
		String Gpictures = Gpicture+".jpg";
		map.put("ogoods", orderService.getBgoods(Gpictures));
		System.out.println(orderService.getBgoods(Gpictures));
		return "Buymessage";
	}
	
	@RequestMapping(value="/BuyShopping",method=RequestMethod.POST)
	public String BuyShoppings(Orders orders,Map<Object, Object> map,HttpSession session) {
		System.out.println("bbbb"+orders.getOname()+orders.getOaddress()+orders.getObusiness());
		orders.setOuser(userservice.getuser((int)(session.getAttribute("id"))));
		String uuid = UUID.randomUUID().toString().substring(0, 10);
		orders.setOnumber(uuid);
		orderService.addOrder(orders);
		List<Shop>list = goodsService.getShop((int)(session.getAttribute("id")));
		
		map.put("shop", list);
	return "shopping";
	}
	
	//�¼���Ʒ����
	public String xjGoods(@RequestParam(value="pn",defaultValue="1")Integer pn
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
	
	//�����Ʒ������С��
	@RequestMapping("/user_byshop/{id}")
	public String addgoods_shop(@PathVariable("id")int id,HttpSession session) {
		User user = (User) session.getAttribute("users");
		if(user!=null) {
			Bgoods bgoods = goodsService.getBgoods(id);
			Shop shop = new Shop();
			shop.setSname(bgoods.getGname());
			shop.setSprice(bgoods.getGprice());
			shop.setSpicture(bgoods.getGpicture());	
			shop.setSaddress(user.getAddress());
			shop.setSuser(user.getUsername());
			goodsService.user_addgoods_shop(shop);
			
		}
		
		return"redirect:/select_Tspage";
	}
	
	//������Ʒ��ģ����ѯ
	@RequestMapping("/select_goods_byname")
	public String select_goods_byname(@RequestParam String Gname,@RequestParam(value="pn",defaultValue="1")Integer pn
			,Model model,HttpSession session) {
		PageHelper.startPage(pn, 5);
		List<Bgoods> list =  goodsService.select_goods_byname(Gname);
		PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
 		model.addAttribute("pageInfo", page);
		if(list.isEmpty()) {
			return "/goods/selectfile";		
		}else {
			model.addAttribute("bgoodsByname", list);
			session.setAttribute("Gname_page", Gname);
			System.out.println(list);
			return "/goods/selectByname";
		}
		
	}
	//ģ����ѯ��ҳ
	@RequestMapping("/select_page")
	public String select_goods_bynamepage(@RequestParam(value="pn",defaultValue="1")Integer pn
			,Model model,HttpSession session) {
		PageHelper.startPage(pn, 5);
		String Gname = session.getAttribute("Gname_page").toString();
		List<Bgoods> list =  goodsService.select_goods_byname(Gname);
		PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
		model.addAttribute("pageInfo", page);
		model.addAttribute("bgoodsByname", list);
		return "/goods/selectByname";
	}
	
	//������Ʒ��ģ����ѯ
	@RequestMapping("/select_byname")
	public String select_byname(@RequestParam String Gname,@RequestParam(value="pn",defaultValue="1")Integer pn
			,Model model,HttpSession session) {
		PageHelper.startPage(pn, 5);
		System.out.println(Gname);
		List<Bgoods> list =  goodsService.select_goods_byname(Gname);
		System.out.println(list);
		PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
 		model.addAttribute("pageInfo", page);
		if(list.isEmpty()) {
			return "/goods/user_selecfail";		
		}else {
			model.addAttribute("bgoodsByname", list);
			session.setAttribute("Gname_page", Gname);
			System.out.println(list);
			return "/goods/select_usergoodsByname";
		}
		
	}
	
	@RequestMapping("/select_Userpage")
	public String select_ds_bynamepage(@RequestParam(value="pn",defaultValue="1")Integer pn
			,Model model,HttpSession session) {
		PageHelper.startPage(pn, 5);
		String Gname = session.getAttribute("Gname_page").toString();
		List<Bgoods> list =  goodsService.select_goods_byname(Gname);
		PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
		model.addAttribute("pageInfo", page);
		model.addAttribute("bgoodsByname", list);
		
		return "/goods/select_usergoodsByname";
	}
	//�����ʾ
	@RequestMapping("/select_Tspage")
	public String select_dss_bynamepage(@RequestParam(value="pn",defaultValue="1")Integer pn
			,Model model,HttpSession session,HttpServletRequest request) {
		PageHelper.startPage(pn, 5);
		String Gname = session.getAttribute("Gname_page").toString();
		List<Bgoods> list =  goodsService.select_goods_byname(Gname);
		PageInfo<Bgoods>page = new PageInfo<Bgoods>(list,5);
		model.addAttribute("pageInfo", page);
		model.addAttribute("bgoodsByname", list);
		request.setAttribute("aa","aa");
		return "/goods/select_usergoodsByname";
	}

}
