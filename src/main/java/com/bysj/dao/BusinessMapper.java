package com.bysj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;

public interface BusinessMapper {
	public Business getbusiness(@Param("username")String username,@Param("password")String password);
	public List<Bgoods> getBgoods(String username);
	public void addGoods(Bgoods bgoods);
	public Business getBusinessByname(String username);
}
