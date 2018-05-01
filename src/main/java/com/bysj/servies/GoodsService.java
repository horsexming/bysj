package com.bysj.servies;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bysj.bean.Bgoods;

import com.bysj.bean.Shop;
import com.bysj.dao.GoodsMapper;

@Service("goodsService")
public class GoodsService {
	@Autowired
	GoodsMapper goodsMapper;
	public Bgoods getBgoods(int id) {
		return goodsMapper.getBgoods(id);
		
	}
	
	public List<Shop> getShop(int id) {
		
		return goodsMapper.getShop(id);
	}
	//删除购物车商品
	public void deleteShop(int id) {
		goodsMapper.deleteShop(id);
	}
	
	//商品模糊查询
	public List<Bgoods> select_goods_byname(String Gname) {
		List<Bgoods> list = goodsMapper.select_goods_byname(Gname);
		
		return list;
	}
	
	public List<Bgoods> select_byname(@Param("Gname")String Gname){
		List<Bgoods> list = goodsMapper.select_goods_byname(Gname);
		
		return list;
	}
	
	//添加商品到购物小车
	public void user_addgoods_shop(Shop shop) {
		goodsMapper.user_addgoods_shop(shop);
	}
	
}
