package com.dmc.maper;

import com.dmc.domain.*;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
public interface FlowMapper {

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow")
    List<Flow> listAll();

    @Select("SELECT * from flow")
    List<Flow> queryAll();
    
    @Select("SELECT * FROM process where Date=(select max(Date) from  process) order by AccessNumChange desc limit 0,3;")
    List<ProcessData> queryProcessData();

    @Select("SELECT sourceDetails from source")
    List<Source> queryAllSourceDetails();

    @Select("SELECT distinct source from source")
    List<SourceCondition> getSearchSource();

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow WHERE date = #{date} and sourceDetails = #{sourceDetails}")
    List<Flow> getDataByCondition(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow WHERE date = #{date}")
    List<Flow> getDataByDate(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow WHERE sourceDetails = #{sourceDetails}")
    List<Flow> getDataBySourceDetails(SearchCondition searchCondition);


}
