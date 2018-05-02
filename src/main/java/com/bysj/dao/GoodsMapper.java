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
	//ɾ���û����ﳵ��Ʒ
	public void deleteShop(int id);
	//ɾ��������Ʒ
	public void deleteGoods(int id);
	
	//��ѯ��Ʒģ����ѯ
	public List<Bgoods> select_goods_byname(@Param("Gname")String Gname);
	
	//��ѯ��Ʒģ����ѯ
	public List<Bgoods> select_byname(@Param("Gname")String Gname);
	//��Ʒ���빺��С��
	public void user_addgoods_shop(Shop shop);
	
	//�¼���Ʒ
	public void out_bgoods(int id);
	//�¼���Ʒ��ӵ��¼ܱ�
	public void add_xgoods(Bgoods xgoods);
	//�¼���Ʒ���ѯ
	public List<Xgoods> select_xgoods(String username);
	//ɾ���¼���Ʒ
	public void delete_xgoods(int id);
	

}
