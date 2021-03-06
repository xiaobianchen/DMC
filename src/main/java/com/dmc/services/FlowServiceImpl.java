package com.dmc.services;

import com.dmc.domain.entity.Flow;
import com.dmc.domain.entity.ProcessData;
import com.dmc.domain.entity.SearchCondition;
import com.dmc.domain.entity.Source;
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
    public List<String> queryAllSource(Source source) {
        return flowMapper.queryAllSources(source);
    }

    @Override
    public List<String> queryAllSourceDetails(Source source) {
        return flowMapper.queryAllSourceDetails(source);
    }

    @Override
    public List<Flow> getDataByDate(SearchCondition searchCondition) {
        return flowMapper.getDataByDate(searchCondition);
    }

    @Override
    public List<String> getSearchSource() {
        return flowMapper.getSearchSource();
    }

    @Override
    public List<Flow> queryAll() {
        return flowMapper.queryAll();
    }

    @Override
    public List<String> getSources() {
        return flowMapper.getSources();
    }

    @Override
    public List<String> getSourceDetails() {
        return flowMapper.getSourceDetails();
    }
}
