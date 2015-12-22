package com.dmc.domain.entity;
/**
 * 
 * Created by Xiaobian Chen on 2015年10月14日
 *
 *
 */
public class Process {
	
	private String Source;
	private String SourceDetail;
	private int AccessNumChange;
	private int CurrentAccessNumChange;
	private int PreviousOneDayAccessNum;
	private int PreviousTwoDayAccessNum;
	private int PreviousWeekAccessNum;
	private String TB;
	private String HB;
	private String Date;
	
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getSourceDetail() {
		return SourceDetail;
	}
	public void setSourceDetail(String sourceDetail) {
		SourceDetail = sourceDetail;
	}
	public int getAccessNumChange() {
		return AccessNumChange;
	}
	public void setAccessNumChange(int accessNumChange) {
		AccessNumChange = accessNumChange;
	}
	public int getCurrentAccessNumChange() {
		return CurrentAccessNumChange;
	}
	public void setCurrentAccessNumChange(int currentAccessNumChange) {
		CurrentAccessNumChange = currentAccessNumChange;
	}
	public int getPreviousOneDayAccessNum() {
		return PreviousOneDayAccessNum;
	}
	public void setPreviousOneDayAccessNum(int previousOneDayAccessNum) {
		PreviousOneDayAccessNum = previousOneDayAccessNum;
	}
	public int getPreviousTwoDayAccessNum() {
		return PreviousTwoDayAccessNum;
	}
	public void setPreviousTwoDayAccessNum(int previousTwoDayAccessNum) {
		PreviousTwoDayAccessNum = previousTwoDayAccessNum;
	}
	public int getPreviousWeekAccessNum() {
		return PreviousWeekAccessNum;
	}
	public void setPreviousWeekAccessNum(int previousWeekAccessNum) {
		PreviousWeekAccessNum = previousWeekAccessNum;
	}
	public String getTB() {
		return TB;
	}
	public void setTB(String tB) {
		TB = tB;
	}
	public String getHB() {
		return HB;
	}
	public void setHB(String hB) {
		HB = hB;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	@Override
	public String toString() {
		return "ProcessData [Source=" + Source + ", SourceDetail="
				+ SourceDetail + ", AccessNumChange=" + AccessNumChange
				+ ", CurrentAccessNumChange=" + CurrentAccessNumChange
				+ ", PreviousOneDayAccessNum=" + PreviousOneDayAccessNum
				+ ", PreviousTwoDayAccessNum=" + PreviousTwoDayAccessNum
				+ ", PreviousWeekAccessNum=" + PreviousWeekAccessNum + ", TB="
				+ TB + ", HB=" + HB + ", Date=" + Date + "]";
	}
}
