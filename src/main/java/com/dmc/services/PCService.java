package com.dmc.services;

import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
public interface PCService {
    List<PC> listAll();
    List<PC> getDataByStartTime(SearchCondition searchCondition);
    List<PC> getDataByEndTime(SearchCondition searchCondition);
    List<PC> getDataByTime(SearchCondition searchCondition);
}
