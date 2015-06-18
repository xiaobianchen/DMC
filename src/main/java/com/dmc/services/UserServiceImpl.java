package com.dmc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmc.domain.User;
import com.dmc.maper.UserMapper;
/**
 * 
 *  Created by Xiaobian Chen on 2015Äê6ÔÂ17ÈÕ
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void insert(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public boolean getUserByUserName(String username) {
		User user = userMapper.getUserByUserName(username);
		if(user != null){
			return true;
		}
		return false;
	}

	@Override
	public boolean getUserByEmail(String email) {
		User user = userMapper.getUserByEmail(email);
		if(user != null){
			return true;
		}
		return false;
	}

	@Override
	public boolean getUserByPhone(String phone) {
		User user = userMapper.getUserByPhone(phone);
		if(user != null){
			return true;
		}
		return false;
	}

	@Override
	public boolean getUserByLogin(String username, String password) {
		User user = userMapper.getUserByUserName(username);
		if(user!=null && user.getPassword().equals(password)){
			return true;
		}
		return false;
	}
}
