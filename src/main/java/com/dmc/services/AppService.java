package com.dmc.services;

import com.dmc.domain.entity.App;
import com.dmc.domain.entity.SearchCondition;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
public interface AppService {
    List<App> listAll();
    List<App> getDataByCondition(SearchCondition searchCondition);
    List<App> getDataByDate(SearchCondition searchCondition);
    List<String> getSources();
    List<String> getSourceDetails();
}
