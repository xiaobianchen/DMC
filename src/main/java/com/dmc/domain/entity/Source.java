package com.dmc.domain.entity;

/**
 * Created by xiaobianchen on 15/10/20.
 */
public class Source {

    private String sourceDetails;
    private String source;
    private String origin;

    public String getSourceDetails() {
        return sourceDetails;
    }

    public void setSourceDetails(String sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "";
    }
}
