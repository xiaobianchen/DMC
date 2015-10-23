package com.dmc.services;

import com.dmc.domain.App;
import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
public interface AppService {
    List<App> listAll();
    List<App> getDataByCondition(SearchCondition searchCondition);
    List<App> getDataByDate(SearchCondition searchCondition);
    List<App> getDataBySourceDetails(SearchCondition searchCondition);
}
