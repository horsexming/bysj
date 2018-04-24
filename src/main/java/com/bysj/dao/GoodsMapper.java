package com.bysj.dao;

import java.util.List;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Orders;
import com.bysj.bean.Shop;

public interface GoodsMapper {
	
	public Bgoods getBgoods(int id);
	
	public List<Shop> getShop(int id);
	
	public void deleteShop(int id);
	
	

}
