package com.dmc.domain.entity;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月23日
 *
 *
 */
public class Comment {
	private int id;
	private String comments;
	private String type;
	private String contact;
	private String reportTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getReportTime() {
		return reportTime;
	}
	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", comments=" + comments + ", type="
				+ type + ", contact=" + contact + ", reportTime=" + reportTime
				+ "]";
	}
}
