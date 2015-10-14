package com.dmc.maper;

import com.dmc.domain.Flow;
import com.dmc.domain.ProcessData;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public interface FlowMapper {

    @Select("SELECT * FROM flow")
    List<Flow> listAll();
    
    @Select("SELECT Source,SourceDetail,AccessNumChange,CurrentAccessNumChange,PreviousOneDayAccessNum,PreviousTwoDayAccessNum,PreviousWeekAccessNum,TB,HB,Date FROM process where Date=(select max(Date) from  process) order by AccessNumChange desc limit 0,3;")
    List<ProcessData> queryProcessData();

}
