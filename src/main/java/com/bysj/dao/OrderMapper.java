package com.bysj.dao;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.Orders;


public interface OrderMapper {
	
	public Bgoods getBgoods(String Gpicture);
	
	public Business getBname(String Gpicture);
	
	public void addOrder(Orders order);

}
