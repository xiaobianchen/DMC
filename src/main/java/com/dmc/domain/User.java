package com.dmc.domain;
/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ11ÈÕ
 * User Information
 *
 */
public class User {
	private String username;
	private String email;
	private String birthday;
	private String password;
	private String repassword;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
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
	
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email
				+ ", birthday=" + birthday + ", password=" + password
				+ ", repassword=" + repassword + "]";
	}
}
