package com.dmc.domain;

import java.util.Arrays;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月3日
 *
 *
 */
public class Picture {
	private int id;
	private String fileName;
	private byte[] fileStream;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Picture [fileName=" + fileName + ", fileStream="
				+ Arrays.toString(fileStream) + "]";
	}
}
