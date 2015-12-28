package com.dmc.domain.entity;

/**
 * @author xiaobianchen
 * @version 1.0 2015/10/20
 * @link https://github.com/xiaobianchen/DMC
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
