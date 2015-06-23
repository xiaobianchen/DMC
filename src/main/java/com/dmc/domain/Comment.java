package com.dmc.domain;
/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ23ÈÕ
 *
 *
 */
public class Comment {
	private String comments;
	private String type;
	private String contact;
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Comment [comments=" + comments + ", type=" + type
				+ ", contact=" + contact + "]";
	}
}
