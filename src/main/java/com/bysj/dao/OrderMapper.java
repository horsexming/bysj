package com.bysj.dao;

import java.util.List;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.Orders;


public interface OrderMapper {
	
	public Bgoods getBgoods(String Gpicture);
	
	public Business getBname(String Gpicture);
	
	public void addOrder(Orders order);
	//通过用户名查询订单信息
	public List<Orders>getorders_byusername(String username);
	//通过商家查询订单信息
	public List<Orders>getorders_bybusiness(String username);

}
