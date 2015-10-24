package com.dmc.services;

import com.dmc.domain.Flow;
import com.dmc.domain.ProcessData;
import com.dmc.domain.SearchCondition;
import com.dmc.domain.Source;
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
    public List<Flow> getDataByCondition(SearchCondition searchCondition) {
        return flowMapper.getDataByCondition(searchCondition);
    }

    @Override
    public List<Flow> listAll() {
        return flowMapper.listAll();
    }

	@Override
	public List<ProcessData> queryProcessData() {
		return flowMapper.queryProcessData();
	}

    @Override
    public List<Source> queryList() {
        return flowMapper.queryAllSourceDetails();
    }

    @Override
    public List<Flow> getDataByDate(SearchCondition searchCondition) {
        return flowMapper.getDataByDate(searchCondition);
    }

    @Override
    public List<Flow> getDataBySourceDetails(SearchCondition searchCondition) {
        return flowMapper.getDataBySourceDetails(searchCondition);
    }

    @Override
    public List<Flow> queryAll() {
        return flowMapper.queryAll();
    }
}
