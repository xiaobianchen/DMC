package com.dmc.services;

import com.dmc.domain.Flow;
import com.dmc.maper.FlowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
@Service("flowService")
public class FlowServiceImpl implements FlowService {

    @Autowired
    private FlowMapper flowMapper;

    @Override
    public List<Flow> listAll() {
        return flowMapper.listAll();
    }
}