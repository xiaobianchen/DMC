package com.dmc.services.impl;

import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;
import com.dmc.maper.PCMapper;
import com.dmc.services.PCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/10/11
 * @link https://github.com/xiaobianchen/DMC
 *
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
