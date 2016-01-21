package com.dmc.services;

import com.dmc.domain.SearchCondition;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/22
 * @link https://github.com/xiaobianchen/DMC
 *
 */
public interface GenericService<T> {
    List<T> listAll();
    List<T> getDataByCondition(SearchCondition searchCondition);
    List<T> getDataByDate(SearchCondition searchCondition);
    List<String> getSources();
    List<String> getSourceDetails();
}
