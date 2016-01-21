package com.dmc.maper;

import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/10/12
 * @link https://github.com/xiaobianchen/DMC
 *
 */
public interface PCMapper extends BaseMapper{
    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc")
    List<PC> listAll();

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE date = #{date}" )
    List<PC> getDataByDate(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc" )
    List<PC> getDataBySearchCondition(SearchCondition searchCondition);

    @Select("SELECT DISTINCT source from pc")
    List<String> getSources();

    @Select("SELECT DISTINCT sourceDetails from pc")
    List<String> getSourceDetails();

}
