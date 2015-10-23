package com.dmc.maper;

import com.dmc.domain.App;
import com.dmc.domain.PC;
import com.dmc.domain.SearchCondition;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaobianchen on 15/10/11.
 */
public interface AppMapper {
    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from app")
    List<App> listAll();

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from app WHERE date = #{date} and sourceDetails = #{sourceDetails}")
    List<App> getDataByCondition(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from app WHERE date = #{date}")
    List<App> getDataByDate(SearchCondition searchCondition);

    @Select("SELECT merchantName,date,source,sourceDetails,accessNum,accessChange,buyerNum,buyerChange,orderTransferRate,orderTransferChange,payNum,payBuyerNumChange,payAmount,payAmountChange,payTransferRate,payTransferRateChange from app WHERE sourceDetails = #{sourceDetails}")
    List<App> getDataBySourceDetails(SearchCondition searchCondition);
}
