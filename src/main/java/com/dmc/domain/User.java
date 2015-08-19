package com.dmc.domain;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月11日
 * User Information
 *
 */
public class User {
	private String username;
	private String password;
	private String email;
	private String phone;
	private String registerDate;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", registerDate="
				+ registerDate + "]";
	}
}
