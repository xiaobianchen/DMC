package com.dmc.services;

import com.dmc.domain.entity.SearchCondition;

import java.util.List;

/**
 * Created by xiaobianchen on 2015/12/22.
 *
 * Generic Service
 */
public interface GenericService<T> {
    List<T> listAll();
    List<T> getDataByCondition(SearchCondition searchCondition);
    List<T> getDataByDate(SearchCondition searchCondition);
    List<String> getSources();
    List<String> getSourceDetails();
}
