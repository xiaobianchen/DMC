package com.dmc.services;

import com.dmc.domain.Flow;
import com.dmc.domain.ProcessData;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public interface FlowService {

    List<Flow> listAll();
    List<ProcessData> queryProcessData();
    
}
