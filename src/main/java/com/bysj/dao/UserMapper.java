package com.bysj.dao;

import org.apache.ibatis.annotations.Param;

import com.bysj.bean.User;

public interface UserMapper {
	public User getUser(@Param("username")String username,@Param("password")String password);
	public void addUser(User user);
	public User findEmpByName(String name);

}
