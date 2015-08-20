package com.dmc.domain;

import java.util.List;

/**
 * 
 * Created by Xiaobian Chen on 2015年8月20日
 *
 *
 */
public class TableColumn {
	
	private int iTotalRecords;
	private int iTotalDisplayRecords;
	private String sEcho;
	private String sColumns;
	private List<Comment> aaData;
	
	public int getiTotalRecords() {
		return iTotalRecords;
	}
	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}
	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}
	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
	public String getsEcho() {
		return sEcho;
	}
	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}
	public String getsColumns() {
		return sColumns;
	}
	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}
	public List<Comment> getAaData() {
		return aaData;
	}
	public void setAaData(List<Comment> aaData) {
		this.aaData = aaData;
	}
}
