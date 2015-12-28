package com.dmc.domain.entity;

/**
 * @author xiaobianchen
 * @version 1.0 2015/6/18
 * @link https://github.com/xiaobianchen/DMC
 *
 */
public class Login {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
}
