package com.dmc.services;

import com.dmc.domain.entity.PC;
import com.dmc.domain.entity.SearchCondition;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
public interface PCService {
    List<PC> listAll();
    List<PC> getDataByDate(SearchCondition searchCondition);
    List<PC> getDataByCondition(SearchCondition searchCondition);
    List<String> getSources();
    List<String> getSourceDetails();

}
