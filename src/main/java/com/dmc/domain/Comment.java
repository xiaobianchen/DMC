package com.dmc.domain;

import java.util.Arrays;
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
	private String fileName;
	private byte[] fileStream;
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getFileStream() {
		return fileStream;
	}
	public void setFileStream(byte[] fileStream) {
		this.fileStream = fileStream;
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
				+ type + ", contact=" + contact + ", fileName=" + fileName
				+ ", fileStream=" + Arrays.toString(fileStream)
				+ ", reportTime=" + reportTime + "]";
	}
}
