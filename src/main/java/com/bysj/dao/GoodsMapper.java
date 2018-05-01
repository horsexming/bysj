package com.bysj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Orders;
import com.bysj.bean.Shop;

public interface GoodsMapper {
	
	public Bgoods getBgoods(int id);
	
	public List<Shop> getShop(int id);
	//删除用户购物车商品
	public void deleteShop(int id);
	//删除卖家商品
	public void deleteGoods(int id);
	
	//查询商品模糊查询
	public List<Bgoods> select_goods_byname(@Param("Gname")String Gname);
	
	//查询商品模糊查询
	public List<Bgoods> select_byname(@Param("Gname")String Gname);
	//商品加入购物小车
	public void user_addgoods_shop(Shop shop);

}
