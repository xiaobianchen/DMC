package com.dmc.controller;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/22
 * @link https://github.com/xiaobianchen/DMC
 *
 */
@SuppressWarnings("rawtypes")
public interface GenericController {

    public List createPaginationData(int pageNumber, int rows);

    public List getListBasedSearchParameter(String searchParameter, List tList);
}
