package com.bysj.servies;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bysj.bean.Bgoods;

import com.bysj.bean.Shop;
import com.bysj.bean.Xgoods;
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
	//ɾ�����ﳵ��Ʒ
	public void deleteShop(int id) {
		goodsMapper.deleteShop(id);
	}
	
	//��Ʒģ����ѯ
	public List<Bgoods> select_goods_byname(String Gname) {
		List<Bgoods> list = goodsMapper.select_goods_byname(Gname);
		
		return list;
	}
	
	public List<Bgoods> select_byname(@Param("Gname")String Gname){
		List<Bgoods> list = goodsMapper.select_goods_byname(Gname);
		
		return list;
	}
	
	//�����Ʒ������С��
	public void user_addgoods_shop(Shop shop) {
		goodsMapper.user_addgoods_shop(shop);
	}
	
	//�¼���Ʒ
	public void out_bgoods(int id) {
		goodsMapper.out_bgoods(id);
	}
	
	//�¼���Ʒ��ӵ��¼ܱ�
	public void add_xgoods(Bgoods xgoods) {
			goodsMapper.add_xgoods(xgoods);
	}
		//�¼���Ʒ��ѯ
	public List<Xgoods> select_xgoods(String username) {
		return goodsMapper.select_xgoods(username);
		
	}
	//ɾ���¼���Ʒ
	public void delete_xgoods(int id) {
		goodsMapper.delete_xgoods(id);
	}
	
	//��ѯ�¼���Ʒ
		public Xgoods getXgoods(int id) {
			return goodsMapper.getXgoods(id);
		}
}
