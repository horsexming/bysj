package com.bysj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Orders;
import com.bysj.bean.Shop;
import com.bysj.bean.Xgoods;

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
	
	//下架商品
	public void out_bgoods(int id);
	//下架商品添加到下架表
	public void add_xgoods(Bgoods xgoods);
	//下架商品添查询
	public List<Xgoods> select_xgoods(String username);
	//删除下架商品
	public void delete_xgoods(int id);
	
	//查询下架商品
	public Xgoods getXgoods(int id);
	

}
