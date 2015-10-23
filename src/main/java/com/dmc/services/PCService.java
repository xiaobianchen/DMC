package com.dmc.services;

import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
public interface PCService {
    List<PC> listAll();
    List<PC> getDataByCondition(SearchCondition searchCondition);
    List<PC> getDataByDate(SearchCondition searchCondition);
    List<PC> getDataBySourceDetails(SearchCondition searchCondition);
}
