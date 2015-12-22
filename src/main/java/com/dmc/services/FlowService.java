package com.dmc.services;

import com.dmc.domain.entity.ProcessData;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
@SuppressWarnings("rawtypes")
public interface FlowService extends GenericService{
    List<ProcessData> queryProcessData();
    List<String> getSearchSource();
}
