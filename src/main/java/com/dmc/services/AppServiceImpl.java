package com.dmc.services;

import com.dmc.domain.entity.SearchCondition;
import com.dmc.maper.AppMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
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
