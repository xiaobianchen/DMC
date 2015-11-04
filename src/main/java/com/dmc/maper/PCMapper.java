package com.dmc.maper;

import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/12.
 */
public interface PCMapper {
    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc")
    List<PC> listAll();

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE date = #{date} and source = #{firstBranch} and sourceDetails = #{secondBranch}" )
    List<PC> getDataByDate(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE source = #{firstBranch} and sourceDetails = #{secondBranch}" )
    List<PC> getDataBySearchCondition(SearchCondition searchCondition);

    @Select("SELECT DISTINCT source from pc")
    List<String> getSources();

    @Select("SELECT DISTINCT sourceDetails from pc")
    List<String> getSourceDetails();

}
