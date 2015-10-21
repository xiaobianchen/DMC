package com.dmc.maper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dmc.domain.ResetPassword;
import com.dmc.domain.User;

import java.util.List;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月16日
 * User Mapper: SQL with User
 *
 */
public interface UserMapper {
	 @Insert("INSERT INTO user(username, password,"
			+ "email, phone,registerDate) VALUES"
			+ "(#{username},#{password}, #{email},"
			+ "#{phone},#{registerDate})")
	 @Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
     public void insertUser(User user);
	
	
	@Select("SELECT username as username, password as password, "
			+ "email as email, "
			+ "phone as phone, registerDate as registerDate "
			+ "FROM user WHERE username = #{username}")
	 public User getUserByUserName(String username);
	
	@Select("SELECT username as username, password as password, "
			+ "email as email, "
			+ "phone as phone, registerDate as registerDate "
			+ "FROM user WHERE email = #{email}")
	 public User getUserByEmail(String email);
	
	
	@Select("SELECT username as username, password as password, "
			+ "email as email, "
			+ "phone as phone, registerDate as registerDate "
			+ "FROM user WHERE phone = #{phone}")
	 public User getUserByPhone(String phone);
	
	 
	 @Update("UPDATE user SET password = #{password} where username = #{username}")
	 public void updateUser(ResetPassword reset);

     @Select("SELECT username,password,email,phone FROM user")
	 public List<User> listUsers();


	 @Update("DELETE FROM user WHERE username = #{username}")
	 public void deleteUser(String username);

	@Update("UPDATE user SET username = #{username},password = #{password},email=#{email},phone=#{phone} where username = #{username}")
	public void updateUsers(User user);
	
}
