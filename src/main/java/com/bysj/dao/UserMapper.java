package com.bysj.dao;

import org.apache.ibatis.annotations.Param;

import com.bysj.bean.User;

public interface UserMapper {
	public User getUser(@Param("username")String username,@Param("password")String password);

}
