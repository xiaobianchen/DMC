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

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE date = #{date} and sourceDetails = #{sourceDetails}")
    List<PC> getDataByCondition(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE date = #{date}")
    List<PC> getDataByDate(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from pc WHERE sourceDetails = #{sourceDetails}")
    List<PC> getDataBySourceDetails(SearchCondition searchCondition);

}
