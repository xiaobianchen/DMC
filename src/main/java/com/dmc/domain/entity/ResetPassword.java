package com.dmc.domain.entity;
/**
 * 
 *  Created by Xiaobian Chen on 2015年6月27日
 *  Reset Password Page
 */
public class ResetPassword {
	
	private String username;
	private String oldPassword;
	private String password;
	private String confirmPassword;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "ResetPassword [username=" + username + ", oldPassword="
				+ oldPassword + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
}
