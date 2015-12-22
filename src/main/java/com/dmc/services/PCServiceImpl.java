package com.dmc.services;

import com.dmc.domain.entity.PC;
import com.dmc.domain.entity.SearchCondition;
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
    public List<PC> getDataByDate(SearchCondition searchCondition) {
        return pcMapper.getDataByDate(searchCondition);
    }

    @Override
    public List<PC> getDataByCondition(SearchCondition searchCondition) {
        return pcMapper.getDataBySearchCondition(searchCondition);
    }

    @Override
    public List<String> getSources() {
        return pcMapper.getSources();
    }

    @Override
    public List<String> getSourceDetails() {
        return pcMapper.getSourceDetails();
    }
}
