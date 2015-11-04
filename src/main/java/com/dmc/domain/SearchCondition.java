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
    private String source;
    private String date;
    private String firstBranch;
    private String secondBranch;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFirstBranch() {
        return firstBranch;
    }

    public void setFirstBranch(String firstBranch) {
        this.firstBranch = firstBranch;
    }

    public String getSecondBranch() {
        return secondBranch;
    }

    public void setSecondBranch(String secondBranch) {
        this.secondBranch = secondBranch;
    }

    @Override
    public String toString() {
        return "SearchCondition{" +
                "source='" + source + '\'' +
                ", date='" + date + '\'' +
                ", firstBranch='" + firstBranch + '\'' +
                ", secondBranch='" + secondBranch + '\'' +
                '}';
    }
}
