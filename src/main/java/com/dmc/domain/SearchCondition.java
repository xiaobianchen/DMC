package com.dmc.domain;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/10/23
 *
 * This class is used to encapsulate the searchCondition
 *
 *
 */
public class SearchCondition {

    private String type;
    private String date;
    private String sourceDetails;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSourceDetails() {
        return sourceDetails;
    }

    public void setSourceDetails(String sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    @Override
    public String toString() {
        return "SearchCondition{" +
                "type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", sourceDetails='" + sourceDetails + '\'' +
                '}';
    }
}
