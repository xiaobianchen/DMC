package com.dmc.controller;

import com.dmc.domain.Flow;
import com.dmc.domain.Grid;
import com.dmc.domain.SearchCondition;
import com.dmc.domain.Source;
import com.dmc.services.AppService;
import com.dmc.services.FlowService;
import com.dmc.services.PCService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/10/22
 * This class is used to provide a tools for query data from database
 */
@Controller
@RequestMapping(value="/cstools")
public class SearchController {

    @Autowired
    private FlowService flowService;

    @Autowired
    private PCService pcService;

    @Autowired
    private AppService appService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView searchDataByConditions() {
        List<Source> sourceList = flowService.queryList();
        ModelAndView model = new ModelAndView();
        model.addObject("sourceList", sourceList);
        model.setViewName("search");
        return model;
    }

    /**
     * load data default loading flow data from database
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/list",produces = "application/json;charset=utf-8")
    public @ResponseBody String getDataByConditions(@ModelAttribute("searchCondition")SearchCondition searchCondition,HttpServletRequest request, HttpServletResponse response) {
        Integer page = Integer.valueOf(request.getParameter("page"));
        Integer rows = Integer.valueOf(request.getParameter("rows"));

        String type = searchCondition.getType();
        String dateTime = searchCondition.getDate();
        String sourceDetails = searchCondition.getSourceDetails();

        if (dateTime != null && dateTime.length() != 0) {
            int lastIndex = dateTime.lastIndexOf("/");
            int firstIndex = dateTime.indexOf("/");
            String month = dateTime.substring(0, firstIndex);
            String day = dateTime.substring(firstIndex + 1, lastIndex);
            String year = dateTime.substring(lastIndex + 1);
            dateTime = year + "-" + month + "-" + day;
        }

        List<?> dataList = createSearchData(type, dateTime, sourceDetails);

        Grid grid = new Grid();
        grid.setTotal(dataList.size());
        grid.setRows(dataList);

        Gson gson = new Gson();
        String json = gson.toJson(grid);

        return json;
    }

    /**
     * create search data
     * @param type
     * @param date
     * @param sourceDetails
     * @return
     */
    public List<?> createSearchData(String type,String date,String sourceDetails ) {
        SearchCondition  searchCondition  = new SearchCondition();
        searchCondition.setType(type);
        searchCondition.setDate(date);
        searchCondition.setSourceDetails(sourceDetails);

        List<?> dataList = null;
        /*default query flow data*/
        if(type==null||type.length()==0){
            dataList = flowService.listAll();
        }else if(type.equalsIgnoreCase("pc")) { //condition:pc
            if (date!= null&&sourceDetails!= null) {
                dataList = pcService.getDataByCondition(searchCondition);//date and sourceDetails selected
            }else if(sourceDetails == null || sourceDetails.length()==0) {
                dataList = pcService.getDataByDate(searchCondition);//date selected
            } else if (date==null||date.length()==0) {
                dataList = pcService.getDataBySourceDetails(searchCondition);//sourceDetails selected
            } else {
                dataList = pcService.listAll();
            }
        } else if (type.equalsIgnoreCase("app")) { //condition:app
            if(date != null&& date.length()!=0){
                dataList = appService.getDataByDate(searchCondition);
            }else if(sourceDetails!=null&&sourceDetails.length()!=0) {
                dataList = appService.getDataBySourceDetails(searchCondition);
            }else if (date != null && date.length() != 0 && sourceDetails != null && sourceDetails.length() != 0) {
                dataList = appService.getDataByCondition(searchCondition);
            }else{
                dataList = appService.listAll();
            }
        } else {                                   //condition:flow
            if(date != null && date.length()!=0){
                dataList = flowService.getDataByDate(searchCondition);
            }else if(sourceDetails != null && sourceDetails.length() != 0){
                dataList = flowService.getDataBySourceDetails(searchCondition);
            } else if (date != null && date.length() != 0 && sourceDetails != null && sourceDetails.length() != 0) {
                dataList = flowService.getDataByCondition(searchCondition);
            }else{
                dataList = flowService.listAll();
            }
        }
        return dataList;
    }
}
