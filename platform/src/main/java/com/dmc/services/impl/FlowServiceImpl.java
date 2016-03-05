package com.dmc.services.impl;

import com.dmc.domain.Flow;
import com.dmc.domain.ProcessData;
import com.dmc.domain.SearchCondition;
import com.dmc.maper.FlowMapper;
import com.dmc.services.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/9/21
 * @link https://github.com/xiaobianchen/DMC
 *
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
    public List<Flow> getDataByDate(SearchCondition searchCondition) {
        return flowMapper.getDataByDate(searchCondition);
    }

    @Override
    public List<String> getSearchSource() {
        return flowMapper.getSearchSource();
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
