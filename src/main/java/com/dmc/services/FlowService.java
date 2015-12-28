package com.dmc.services;

import com.dmc.domain.entity.ProcessData;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/9/21
 * @link https://github.com/xiaobianchen/DMC
 *
 */
@SuppressWarnings("rawtypes")
public interface FlowService extends GenericService{
    List<ProcessData> queryProcessData();
    List<String> getSearchSource();
}
