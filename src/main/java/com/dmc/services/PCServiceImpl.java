package com.dmc.services;

import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;
import com.dmc.maper.PCMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
@Service("pcService")
public class PCServiceImpl implements PCService {


    @Autowired
    private PCMapper pcMapper;

    @Override
    public List<PC> listAll() {
        return pcMapper.listAll();
    }

    @Override
    public List<PC> getDataByStartTime(SearchCondition searchCondition) {
        return pcMapper.getDataByStartTime(searchCondition);
    }

    @Override
    public List<PC> getDataByEndTime(SearchCondition searchCondition) {
        return pcMapper.getDataByEndTime(searchCondition);
    }

    @Override
    public List<PC> getDataByTime(SearchCondition searchCondition) {
        return pcMapper.getDataByTime(searchCondition);
    }
}
