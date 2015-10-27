package com.dmc.services;

import com.dmc.domain.*;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public interface FlowService {

    List<Flow> listAll();

    List<Flow> queryAll();

    List<ProcessData> queryProcessData();

    List<Source> queryList();

    List<Flow> getDataByCondition(SearchCondition searchCondition);

    List<Flow> getDataByDate(SearchCondition searchCondition);

    List<Flow> getDataBySourceDetails(SearchCondition searchCondition);

    List<SourceCondition> getSearchSource();

}
