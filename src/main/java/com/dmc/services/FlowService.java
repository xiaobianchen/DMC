package com.dmc.services;

import com.dmc.domain.entity.Flow;
import com.dmc.domain.entity.ProcessData;
import com.dmc.domain.entity.SearchCondition;
import com.dmc.domain.entity.Source;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public interface FlowService {

    List<Flow> listAll();
    List<Flow> queryAll();
    List<ProcessData> queryProcessData();
    List<String> queryAllSource(Source source);
    List<String> queryAllSourceDetails(Source source);
    List<Flow> getDataByCondition(SearchCondition searchCondition);
    List<Flow> getDataByDate(SearchCondition searchCondition);
    List<String> getSearchSource();
    List<String> getSources();
    List<String> getSourceDetails();


}
