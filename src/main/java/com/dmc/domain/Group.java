package com.dmc.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *  Created by Xiaobian Chen on 2015年7月11日
 */
public class Group {
	
	private Long id;
	private String name;
	private List<User> users = new ArrayList<User>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void addUser(User user){
		users.add(user);
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
}