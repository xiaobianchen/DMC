package com.dmc.domain;
/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ11ÈÕ
 * User Information
 *
 */
public class User {
	private String username;
	private String password;
	private String repassword;
	private String email;
	private String phone;
	
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
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
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", repassword=" + repassword + ", email=" + email
				+ ", phone=" + phone + "]";
	}
}
