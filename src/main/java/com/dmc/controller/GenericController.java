package com.dmc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

/**
 * Created by xiaobianchen on 2015/12/22.
 */
@SuppressWarnings("rawtypes")
public interface GenericController {
    public String list(HttpServletRequest request,HttpServletResponse response);
	public List createPaginationData(int pageNumber,int rows);
    public List getListBasedSearchParameter(String searchParameter,List tList);
}
