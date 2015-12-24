package com.dmc.controller;

import java.util.List;

/**
 * Created by xiaobianchen on 2015/12/22.
 */
@SuppressWarnings("rawtypes")
public interface GenericController {

    public List createPaginationData(int pageNumber, int rows);

    public List getListBasedSearchParameter(String searchParameter, List tList);
}
