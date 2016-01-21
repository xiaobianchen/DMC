package com.dmc.services.impl;

import com.dmc.domain.SearchCondition;
import com.dmc.maper.AppMapper;

import com.dmc.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/10/11
 * @link https://github.com/xiaobianchen/DMC
 */
@Service("appService")
@SuppressWarnings("rawtypes")
public class AppServiceImpl implements AppService {
    @Autowired
    private AppMapper appMapper;

   
	@Override
    public List listAll() {
        return appMapper.listAll();
    }

    @Override
    public List getDataByCondition(SearchCondition searchCondition) {
        return appMapper.getDataByCondition(searchCondition);
    }

    @Override
    public List getDataByDate(SearchCondition searchCondition) {
        return appMapper.getDataByDate(searchCondition);
    }

    @Override
    public List<String> getSources() {
        return appMapper.getSources();
    }

    @Override
    public List<String> getSourceDetails() {
        return appMapper.getSourceDetails();
    }
}
