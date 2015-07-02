package com.dmc.domain;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * Created by Xiaobian Chen on 2015��6��23��
 *
 *
 */
public class Comment {
	private int id;
	private String comments;
	private String type;
	private String contact;
	private byte[] picture;
	private String reportTime;
	private MultipartFile pictureFile;
	
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
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public String getReportTime() {
		return reportTime;
	}
	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}
	public MultipartFile getPictureFile() {
		return pictureFile;
	}
	public void setPictureFile(MultipartFile pictureFile) {
		this.pictureFile = pictureFile;
	}
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", comments=" + comments + ", type="
				+ type + ", contact=" + contact + ", picture="
				+ Arrays.toString(picture) + ", reportTime=" + reportTime
				+ ", pictureFile=" + pictureFile + "]";
	}
}
