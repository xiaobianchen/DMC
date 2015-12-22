package com.dmc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmc.domain.entity.ResetPassword;
import com.dmc.domain.entity.User;
import com.dmc.maper.UserMapper;

import java.util.List;

/**
 * 
 *  Created by Xiaobian Chen on 2015年6月17日
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void insert(User user) {
		userMapper.insertUser(user);
	}

	/**
	 * get username from database
	 * @param username
	 * @return
	 */
	@Override
	public boolean getUserByUserName(String username) {
		User user = userMapper.getUserByUserName(username);
		if(user != null){
			return true;
		}
		return false;
	}

	/**
	 * get email from database
	 * @param email
	 * @return
	 */
	@Override
	public boolean getUserByEmail(String email) {
		User user = userMapper.getUserByEmail(email);
		if(user != null){
			return true;
		}
		return false;
	}

	/**
	 * get phone from database
	 * @param phone
	 * @return
	 */
	@Override
	public boolean getUserByPhone(String phone) {
		User user = userMapper.getUserByPhone(phone);
		if(user != null){
			return true;
		}
		return false;
	}

	/**
	 * verify user via username and password
	 * @param username
	 * @param password
	 * @return
	 */
	@Override
	public boolean getUserByLogin(String username, String password) {
		User user = userMapper.getUserByUserName(username);
		if(user!=null && user.getPassword().equals(password)){
			return true;
		}
		return false;
	}

	/**
	 * reset password
	 * @param reset
	 */
	@Override
	public void updateUser(ResetPassword reset) {
		userMapper.updateUser(reset);
	}

	@Override
	public void deleteUser(String username) {
         userMapper.deleteUser(username);
	}

	@Override
	public List<User> listUsers() {
		return userMapper.listUsers();
	}

	@Override
	public void updateUsers(User user) {
        userMapper.updateUsers(user);
	}
}
