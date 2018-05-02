package com.bysj.servies;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bysj.bean.Bgoods;
import com.bysj.bean.Business;
import com.bysj.dao.BusinessMapper;
@Service("businessService")
public class BusinessService {
	@Autowired
	BusinessMapper businessMapper;
	public Business getbusiness(String username,String password) {
		
		return businessMapper.getbusiness(username, password);
	}
	
	public List<Bgoods> getBgoods(String username) {
		
		return businessMapper.getBgoods(username);
	}
	
	public void addGoods(Bgoods bgoods) {
		
		businessMapper.addGoods(bgoods);
	}
	
	public Business getBusinessByname(String username) {
		return businessMapper.getBusinessByname(username);
		
	}
	//ע����֤
	public int  findEmpByName(String username){
		if(businessMapper.getBusinessByname(username)!=null){
			
			return 1;
		}else{
			return 0;
		}
		
	}
	//���¸�����Ϣ
	public void business_update(Business businee) {
		 businessMapper.business_update(businee);
	}
	//ע��
	public void add_business(Business business) {
		businessMapper.add_business(business);
	}

}
