package com.dmc.domain;

/**
 * Created by xiaobianchen on 15/10/20.
 */
public class Source {

    private String sourceDetails;

    public String getSourceDetails() {
        return sourceDetails;
    }

    public void setSourceDetails(String sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    @Override
    public String toString() {
        return sourceDetails;
    }
}
