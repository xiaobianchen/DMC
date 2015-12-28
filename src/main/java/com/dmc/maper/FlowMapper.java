package com.dmc.maper;

import com.dmc.domain.entity.Flow;
import com.dmc.domain.entity.ProcessData;
import com.dmc.domain.entity.SearchCondition;
import com.dmc.domain.entity.Source;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/**
 * @author xiaobianchen
 * @version 1.0 2015/9/21
 * @link https://github.com/xiaobianchen/DMC
 *
 */
public interface FlowMapper extends BaseMapper{

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow")
    List<Flow> listAll();

    @Select("SELECT * from flow")
    List<Flow> queryAll();
    
    @Select("SELECT * FROM process where Date=(select max(Date) from  process) order by AccessNumChange desc limit 0,3;")
    List<ProcessData> queryProcessData();

    @Select("SELECT DISTINCT source from source WHERE origin = #{origin}")
    List<String> queryAllSources(Source source);

    @Select("SELECT DISTINCT sourceDetails from source origin = #{origin}")
    List<String> queryAllSourceDetails(Source source);

    @Select("SELECT distinct origin from source")
    List<String> getSearchSource();

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow")
    List<Flow> getDataByCondition(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow WHERE date = #{date}")
    List<Flow> getDataByDate(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from flow WHERE sourceDetails = #{sourceDetails}")
    List<Flow> getDataBySourceDetails(SearchCondition searchCondition);

    @Select("SELECT DISTINCT source from flow")
    List<String> getSources();

    @Select("SELECT DISTINCT sourceDetails from flow")
    List<String> getSourceDetails();

}
