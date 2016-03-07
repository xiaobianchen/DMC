package com.dmc.domain;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/6
 */
public class String2DateConverter implements Converter<String,Date> {

    private String datePattern;

    public String2DateConverter(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date convert(String source) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            sdf.setLenient(false);
            return sdf.parse(source);
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date format. please use this pattern" + datePattern);
        }
    }
}
