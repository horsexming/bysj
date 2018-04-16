package com.bysj.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bysj.bean.User;
import com.bysj.dao.UserMapper;
@Service("userservice")
public class Userservice {
	@Autowired
	UserMapper userMapper;
	
	public User getUser(String username ,String password) {
		
		return userMapper.getUser(username, password);
	}

}
