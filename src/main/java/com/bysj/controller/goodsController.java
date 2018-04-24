package com.bysj.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bysj.bean.Orders;
import com.bysj.bean.Shop;
import com.bysj.servies.GoodsService;
import com.bysj.servies.OrderService;
import com.bysj.servies.Userservice;


@Controller
public class goodsController {
	
	@Autowired
	GoodsService goodsService;
	@Autowired
	OrderService orderService;
	@Autowired
	Userservice userservice;
	/*得到商品*/
	@RequestMapping(value="/goods/{id}")
	public String getGoods(@PathVariable("id") int id ,Map<Object, Object>map,HttpSession session) {
		
		map.put("goods",goodsService.getBgoods(id));
		return "showgoods";
	}
	
	//获取购物车商品
	@RequestMapping("/shopping/{id}")
	public String shopping(@PathVariable("id")int id ,Map<Object, Object>map,HttpSession session) {
		
		List<Shop>list = goodsService.getShop(id);
		map.put("shop", list);
		session.setAttribute("id",id);
		return "shopping";
	}
	
	//删除购物小车商品
	@RequestMapping("/Deletegoods/{id}")
	public String deletedshop(@PathVariable("id")int id,Map<Object, Object>map,HttpSession session) {
		goodsService.deleteShop(id);
		List<Shop>list = goodsService.getShop((int)(session.getAttribute("id")));
		map.put("shop", list);
		return"shopping";
	}
	
	//购买商品
	@RequestMapping("/Buygoods/{gpictur}")
	public String Buy(@PathVariable("gpictur")String Gpicture,Map<Object, Object>map) {		
		String pic = Gpicture+".jpg";
		map.put("ogoods", orderService.getBgoods(pic));
		map.put("obusiness", orderService.getBusiness(pic));
		return "Buymessage";
	}
	
	@RequestMapping(value="/BuyShopping",method=RequestMethod.POST)
	public String BuyShoppings(Orders orders,Map<Object, Object> map,HttpSession session) {
		System.out.println("bbbb"+orders.getOname()+orders.getOaddress()+orders.getObusiness());
		orders.setOuser(userservice.getuser((int)(session.getAttribute("id"))));		
		orderService.addOrder(orders);
		List<Shop>list = goodsService.getShop((int)(session.getAttribute("id")));
		
		map.put("shop", list);
	return "shopping";
	}
	
	/*@RequestMapping(value="/Buygoods/{gpictur}",method=RequestMethod.POST)
	public String BuyShops(@PathVariable("gpictur")String Gpictur,HttpSession session,Map<Object, Object>map) {
		
		List<Shop>list = goodsService.getShop((int)(session.getAttribute("id")));
		map.put("shop", list);
		return"shopping";
	}*/

}
