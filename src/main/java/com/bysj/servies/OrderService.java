package com.bysj.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.bean.Orders;
import com.bysj.dao.OrderMapper;
@Service("orderService")
public class OrderService {
	@Autowired
	OrderMapper orderMapper;
	
	public Bgoods getBgoods(String Gpicture) {
		return orderMapper.getBgoods(Gpicture);
		
	}
	public Business getBusiness(String Gpicture) {
		return orderMapper.getBname(Gpicture);
		
	}
	
	public void addOrder(Orders order) {
		
		orderMapper.addOrder(order);
	}


}
