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
@SuppressWarnings("rawtypes")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insert(Object o) {
		User user = convert((User) o);
		userMapper.insertUser(user);
	}

	private User convert(User o) {
		return o;
	}

	@Override
	public void update(Object o) {
		User user = convert((User) o);
		userMapper.updateUsers(user);
	}

	@Override
	public void delete(String name) {
		userMapper.deleteUser(name);
	}

	
	@Override
	public List list() {
		return userMapper.listUsers();
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
}
