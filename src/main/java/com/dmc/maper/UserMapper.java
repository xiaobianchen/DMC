package com.dmc.maper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.dmc.domain.User;

/**
 * 
 * Created by Xiaobian Chen on 2015��6��16��
 *
 *
 */
public interface UserMapper {
	@Insert("INSERT INTO user(username, email, birthday,"
			+ "password, repassword) VALUES"
			+ "(#{username},#{email}, #{birthday}, #{password},"
			+ "#{repassword})")
	 @Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
     public void insertUser(User user);
	
	
	
	
}
