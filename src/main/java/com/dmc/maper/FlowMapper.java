package com.dmc.maper;

import com.dmc.domain.Flow;
import com.dmc.domain.ProcessData;

import com.dmc.domain.Source;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public interface FlowMapper {

    @Select("SELECT * FROM flow")
    List<Flow> listAll();
    
    @Select("SELECT * FROM process where Date=(select max(Date) from  process) order by AccessNumChange desc limit 0,3;")
    List<ProcessData> queryProcessData();

    @Select("SELECT sourceDetails from source")
    List<Source> queryAllSourceDetails();

}
