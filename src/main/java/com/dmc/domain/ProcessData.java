package com.dmc.domain;
/**
 * 
 * Created by Xiaobian Chen on 2015年10月14日
 *
 *
 */
public class ProcessData {
	
	private String source;
	private String sourceDetail;
	private int accessNumChange;
	private int currentAccessNumChange;
	private int previousOneDayAccessNum;
	private int previousTwoDayAccessNum;
	private int previousWeekAccessNum;
	private String tb;
	private String hb;
	private String date;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceDetail() {
		return sourceDetail;
	}
	public void setSourceDetail(String sourceDetail) {
		this.sourceDetail = sourceDetail;
	}
	public int getAccessNumChange() {
		return accessNumChange;
	}
	public void setAccessNumChange(int accessNumChange) {
		this.accessNumChange = accessNumChange;
	}
	public int getCurrentAccessNumChange() {
		return currentAccessNumChange;
	}
	public void setCurrentAccessNumChange(int currentAccessNumChange) {
		this.currentAccessNumChange = currentAccessNumChange;
	}
	public int getPreviousOneDayAccessNum() {
		return previousOneDayAccessNum;
	}
	public void setPreviousOneDayAccessNum(int previousOneDayAccessNum) {
		this.previousOneDayAccessNum = previousOneDayAccessNum;
	}
	public int getPreviousTwoDayAccessNum() {
		return previousTwoDayAccessNum;
	}
	public void setPreviousTwoDayAccessNum(int previousTwoDayAccessNum) {
		this.previousTwoDayAccessNum = previousTwoDayAccessNum;
	}
	public int getPreviousWeekAccessNum() {
		return previousWeekAccessNum;
	}
	public void setPreviousWeekAccessNum(int previousWeekAccessNum) {
		this.previousWeekAccessNum = previousWeekAccessNum;
	}
	public String getTb() {
		return tb;
	}
	public void setTb(String tb) {
		this.tb = tb;
	}
	public String getHb() {
		return hb;
	}
	public void setHB(String hb) {
		this.hb = hb;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "ProcessData [Source=" + source + ", SourceDetail="
				+ sourceDetail + ", AccessNumChange=" + accessNumChange
				+ ", CurrentAccessNumChange=" + currentAccessNumChange
				+ ", PreviousOneDayAccessNum=" + previousOneDayAccessNum
				+ ", PreviousTwoDayAccessNum=" + previousTwoDayAccessNum
				+ ", PreviousWeekAccessNum=" + previousWeekAccessNum + ", TB="
				+ tb + ", HB=" + hb + ", Date=" + date + "]";
	}
}
