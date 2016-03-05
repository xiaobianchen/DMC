package com.dmc.domain;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/8/20
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to stored tabletable response
 *
 */
public class TableColumn {
	
	private int iTotalRecords;
	private int iTotalDisplayRecords;
	private String sEcho;
	private String sColumns;
	private List<?> aaData;
	
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
	public List<?> getAaData() {
		return aaData;
	}
	public void setAaData(List<?> aaData) {
		this.aaData = aaData;
	}
}
