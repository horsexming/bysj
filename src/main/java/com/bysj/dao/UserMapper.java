package com.bysj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bysj.bean.Bgoods;
import com.bysj.bean.User;

public interface UserMapper {
	public User getUser(@Param("username")String username,@Param("password")String password);
	public List<Bgoods> getBgoods();
	public void addUser(User user);
	public User findEmpByName(String name);
	
	public String getuser(int id);

}
