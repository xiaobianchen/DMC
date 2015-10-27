package com.dmc.controller;

import com.dmc.domain.*;
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
        List<SourceCondition> dataList = flowService.getSearchSource();
        ModelAndView model = new ModelAndView();
        model.addObject("sourceList", sourceList);
        model.addObject("dataList",dataList);
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
        List<?> dataList = null;
        String source = searchCondition.getSource();

        if(source == null ||source.equals("")){
            dataList = flowService.listAll();
        }else{
            String startTime = searchCondition.getStartDate();
            String endTime = searchCondition.getEndDate();

            if (startTime != null && startTime.length() != 0) {
                formatTime(startTime);
            }

            if(endTime != null && endTime.length() !=0){
                formatTime(endTime);
            }

            dataList = createSearchData(searchCondition);
        }

        Grid grid = new Grid();
        grid.setTotal(dataList.size());
        grid.setRows(dataList);

        Gson gson = new Gson();
        String json = gson.toJson(grid);

        return json;
    }

    /**
     * returns search data via search conditions
     * @param searchCondition
     * @return
     */
    public List<?> createSearchData(SearchCondition searchCondition) {
        String source = searchCondition.getSource();
        String startTime = searchCondition.getStartDate();
        String endTime = searchCondition.getEndDate();

        List<?> dataList = null;
        if(source.equalsIgnoreCase("pc")) { //condition:pc
             if(startTime!=null){
                 pcService.getDataByStartTime(searchCondition);
             }else if(endTime !=null){
                 pcService.getDataByEndTime(searchCondition);
             }else if(startTime!=null&&endTime!=null){
                 pcService.getDataByTime(searchCondition);
             }
        } else if (source.equalsIgnoreCase("app")) { //condition:app

        } else {                                   //condition:flow

        }
        return dataList;
    }

    /**
     * format time
     * @param dateTime
     * @return
     */
    public static String formatTime(String dateTime){
        int lastIndex = dateTime.lastIndexOf("/");
        int firstIndex = dateTime.indexOf("/");
        String month = dateTime.substring(0, firstIndex);
        String day = dateTime.substring(firstIndex + 1, lastIndex);
        String year = dateTime.substring(lastIndex + 1);
        dateTime = year + "-" + month + "-" + day;

        return dateTime;
    }
}
