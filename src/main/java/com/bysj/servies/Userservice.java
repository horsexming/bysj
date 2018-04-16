package com.bysj.servies;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bysj.bean.User;
import com.bysj.dao.UserMapper;
@Service("userservice")
public class Userservice {
	@Autowired
	UserMapper userMapper;
	
	public List<User>  getUser(String username ,String password) {
		List<User> list = new ArrayList<User>();
		list.add(userMapper.getUser(username, password));
		
		return list;
	}
	
	public void addUser(User user) {
		
		userMapper.addUser(user);
	}
	
	public int  findEmpByName(String name){
		if(userMapper.findEmpByName(name)!=null){
			
			return 1;
		}else{
			return 0;
		}
		
	}

}
