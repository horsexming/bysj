package com.bysj.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bysj.bean.Bgoods;
import com.bysj.bean.User;
import com.bysj.dao.UserMapper;
@Service("userservice")
public class Userservice {
	@Autowired
	UserMapper userMapper;
	
	public User getUser(String username ,String password) {
		/*System.out.println(userMapper.getUser(username, password).getPassword());*/
		return userMapper.getUser(username, password);
	}
	
	public void addUser(User user) {
		
		userMapper.addUser(user);
	}
	
	public Bgoods getBgoods(int id) {
		
		return userMapper.getBgoods(id);
	}
	
	public int  findEmpByName(String name){
		if(userMapper.findEmpByName(name)!=null){
			
			return 1;
		}else{
			return 0;
		}
		
	}

}
