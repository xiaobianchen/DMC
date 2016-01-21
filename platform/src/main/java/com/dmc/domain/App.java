package com.dmc.domain;

/**
 * @author xiaobianchen
 * @version 1.0 2015/10/11
 * @link https://github.com/xiaobianchen/DMC
 * This class is an object for the App
 */
public class App {
    private String merchantName;
    private String date;
    private String source;
    private String sourceDetails;
    private int accessNum;
    private String accessChange;
    private int buyerNum;
    private String buyerChange;
    private String orderAmount;
    private String orderChange;
    private String orderTransferRate;
    private String orderTransferChange;
    private int payNum;
    private String payBuyerNumChange;
    private Double payAmount;
    private String payAmountChange;
    private String payTransferRate;
    private String payTransferRateChange;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceDetails() {
        return sourceDetails;
    }

    public void setSourceDetails(String sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    public int getAccessNum() {
        return accessNum;
    }

    public void setAccessNum(int accessNum) {
        this.accessNum = accessNum;
    }

    public String getAccessChange() {
        return accessChange;
    }

    public void setAccessChange(String accessChange) {
        this.accessChange = accessChange;
    }

    public int getBuyerNum() {
        return buyerNum;
    }

    public void setBuyerNum(int buyerNum) {
        this.buyerNum = buyerNum;
    }

    public String getBuyerChange() {
        return buyerChange;
    }

    public void setBuyerChange(String buyerChange) {
        this.buyerChange = buyerChange;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderChange() {
        return orderChange;
    }

    public void setOrderChange(String orderChange) {
        this.orderChange = orderChange;
    }

    public String getOrderTransferRate() {
        return orderTransferRate;
    }

    public void setOrderTransferRate(String orderTransferRate) {
        this.orderTransferRate = orderTransferRate;
    }

    public String getOrderTransferChange() {
        return orderTransferChange;
    }

    public void setOrderTransferChange(String orderTransferChange) {
        this.orderTransferChange = orderTransferChange;
    }

    public int getPayNum() {
        return payNum;
    }

    public void setPayNum(int payNum) {
        this.payNum = payNum;
    }

    public String getPayBuyerNumChange() {
        return payBuyerNumChange;
    }

    public void setPayBuyerNumChange(String payBuyerNumChange) {
        this.payBuyerNumChange = payBuyerNumChange;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayAmountChange() {
        return payAmountChange;
    }

    public void setPayAmountChange(String payAmountChange) {
        this.payAmountChange = payAmountChange;
    }

    public String getPayTransferRate() {
        return payTransferRate;
    }

    public void setPayTransferRate(String payTransferRate) {
        this.payTransferRate = payTransferRate;
    }

    public String getPayTransferRateChange() {
        return payTransferRateChange;
    }

    public void setPayTransferRateChange(String payTransferRateChange) {
        this.payTransferRateChange = payTransferRateChange;
    }

    @Override
    public String toString() {
        return "App{" +
                "merchantName='" + merchantName + '\'' +
                ", date='" + date + '\'' +
                ", source='" + source + '\'' +
                ", sourceDetails='" + sourceDetails + '\'' +
                ", accessNum=" + accessNum +
                ", accessChange='" + accessChange + '\'' +
                ", buyerNum=" + buyerNum +
                ", buyerChange='" + buyerChange + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", orderChange='" + orderChange + '\'' +
                ", orderTransferRate='" + orderTransferRate + '\'' +
                ", orderTransferChange='" + orderTransferChange + '\'' +
                ", payNum=" + payNum +
                ", payBuyerNumChange='" + payBuyerNumChange + '\'' +
                ", payAmount=" + payAmount +
                ", payAmountChange='" + payAmountChange + '\'' +
                ", payTransferRate='" + payTransferRate + '\'' +
                ", payTransferRateChange='" + payTransferRateChange + '\'' +
                '}';
    }
}
