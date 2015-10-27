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

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE date = #{startDate} and source = #{firstBranch} and sourceDetails = #{secondBranch}" )
    List<PC> getDataByStartTime(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE date = #{endDate} and source = #{firstBranch} and sourceDetails = #{secondBranch}" )
    List<PC> getDataByEndTime(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE date between #{startDate} and #{endDate} and source = #{firstBranch} and sourceDetails = #{secondBranch}" )
    List<PC> getDataByTime(SearchCondition searchCondition);

}
