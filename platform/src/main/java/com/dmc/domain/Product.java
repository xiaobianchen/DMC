package com.dmc.domain;

/**
 * @author xiaobianchen
 * @version 1.0 2015/11/2
 * @link https://github.com/xiaobianchen/DMC
 *
 * This class is used to handle product data
 *
 */
public class Product {

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOnSaleTime() {
        return onSaleTime;
    }

    public void setOnSaleTime(String onSaleTime) {
        this.onSaleTime = onSaleTime;
    }

    public String getSaleChannel() {
        return saleChannel;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    private String productId;
    private String onSaleTime;
    private String saleChannel;
    private String brandId;
    private String brand;
    private String title;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    private String itemId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        String productStr = "";
        if(title != null) {
            productStr += getTitle();
        }
        if(productId != null) {
            productStr += getProductId();
        }
        return productStr;
    }
}
