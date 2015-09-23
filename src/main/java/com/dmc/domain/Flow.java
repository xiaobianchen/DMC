package com.dmc.domain;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public class Flow {

    private String MerchantName;
    private String Date;
    private String Source;
    private String SourceDetails;
    private int AccessNum;
    private String  AccessChange;
    private int BuyerNum;
    private String BuyerChange;
    private String OrderAmount;
    private String OrderChange;
    private String OrderTransferRate;
    private String OrderTransferChange;
    private int PayNum;
    private String PayBuyerNumChange;
    private Double PayAmount;
    private String PayAmountChange;
    private String PayTransferRate;
    private String PayTransferRateChange;
    
	public String getMerchantName() {
		return MerchantName;
	}
	public void setMerchantName(String merchantName) {
		MerchantName = merchantName;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getSourceDetails() {
		return SourceDetails;
	}
	public void setSourceDetails(String sourceDetails) {
		SourceDetails = sourceDetails;
	}
	public int getAccessNum() {
		return AccessNum;
	}
	public void setAccessNum(int accessNum) {
		AccessNum = accessNum;
	}
	public String getAccessChange() {
		return AccessChange;
	}
	public void setAccessChange(String accessChange) {
		AccessChange = accessChange;
	}
	public int getBuyerNum() {
		return BuyerNum;
	}
	public void setBuyerNum(int buyerNum) {
		BuyerNum = buyerNum;
	}
	public String getBuyerChange() {
		return BuyerChange;
	}
	public void setBuyerChange(String buyerChange) {
		BuyerChange = buyerChange;
	}
	public String getOrderAmount() {
		return OrderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		OrderAmount = orderAmount;
	}
	public String getOrderChange() {
		return OrderChange;
	}
	public void setOrderChange(String orderChange) {
		OrderChange = orderChange;
	}
	public String getOrderTransferRate() {
		return OrderTransferRate;
	}
	public void setOrderTransferRate(String orderTransferRate) {
		OrderTransferRate = orderTransferRate;
	}
	public String getOrderTransferChange() {
		return OrderTransferChange;
	}
	public void setOrderTransferChange(String orderTransferChange) {
		OrderTransferChange = orderTransferChange;
	}
	public int getPayNum() {
		return PayNum;
	}
	public void setPayNum(int payNum) {
		PayNum = payNum;
	}
	public String getPayBuyerNumChange() {
		return PayBuyerNumChange;
	}
	public void setPayBuyerNumChange(String payBuyerNumChange) {
		PayBuyerNumChange = payBuyerNumChange;
	}
	public Double getPayAmount() {
		return PayAmount;
	}
	public void setPayAmount(Double payAmount) {
		PayAmount = payAmount;
	}
	public String getPayAmountChange() {
		return PayAmountChange;
	}
	public void setPayAmountChange(String payAmountChange) {
		PayAmountChange = payAmountChange;
	}
	public String getPayTransferRate() {
		return PayTransferRate;
	}
	public void setPayTransferRate(String payTransferRate) {
		PayTransferRate = payTransferRate;
	}
	public String getPayTransferRateChange() {
		return PayTransferRateChange;
	}
	public void setPayTransferRateChange(String payTransferRateChange) {
		PayTransferRateChange = payTransferRateChange;
	}
	
	@Override
	public String toString() {
		return "Flow [MerchantName=" + MerchantName + ", Date=" + Date
				+ ", Source=" + Source + ", SourceDetails=" + SourceDetails
				+ ", AccessNum=" + AccessNum + ", AccessChange=" + AccessChange
				+ ", BuyerNum=" + BuyerNum + ", BuyerChange=" + BuyerChange
				+ ", OrderAmount=" + OrderAmount + ", OrderChange="
				+ OrderChange + ", OrderTransferRate=" + OrderTransferRate
				+ ", OrderTransferChange=" + OrderTransferChange + ", PayNum="
				+ PayNum + ", PayBuyerNumChange=" + PayBuyerNumChange
				+ ", PayAmount=" + PayAmount + ", PayAmountChange="
				+ PayAmountChange + ", PayTransferRate=" + PayTransferRate
				+ ", PayTransferRateChange=" + PayTransferRateChange + "]";
	}
}
