package com.dmc.controller;

import com.dmc.domain.Grid;
import com.dmc.domain.SearchCondition;
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
 * @author xiaobianchen
 * @version 1.0 2015/10/22
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to handle cstools
 */
@Controller
@RequestMapping(value="/cstools")
public class CSToolsController{

    @Autowired
    private FlowService flowService;

    @Autowired
    protected PCService pcService;

    @Autowired
    private AppService appService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView searchDataByConditions() {
        List<String> dataList = flowService.getSearchSource();
        ModelAndView model = new ModelAndView();
        model.addObject("dataList", dataList);
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
    public @ResponseBody
    String getDataByConditions(@ModelAttribute("searchCondition")SearchCondition searchCondition,HttpServletRequest request, HttpServletResponse response) {
        Integer page = Integer.valueOf(request.getParameter("page"));
        Integer rows = Integer.valueOf(request.getParameter("rows"));
        List<?> dataList = null;
        String source = searchCondition.getSource();
        String dateTime = searchCondition.getDate();

        if(source == null ||source.equals("")){
            dataList = pcService.listAll();
        }else{
            if (dateTime != null && dateTime.length() != 0) {
                int lastIndex = dateTime.lastIndexOf("/");
                int firstIndex = dateTime.indexOf("/");
                String month = dateTime.substring(0, firstIndex);
                String day = dateTime.substring(firstIndex + 1, lastIndex);
                String year = dateTime.substring(lastIndex + 1);
                dateTime = year + "-" + month + "-" + day;
                searchCondition.setDate(dateTime);
            }

            dataList = createSearchData(searchCondition);
        }

        List<?> processList = createPaginationData(dataList,page,rows);

        Grid grid = new Grid();
        grid.setTotal(processList.size());
        grid.setRows(processList);

        Gson gson = new Gson();
        String json = gson.toJson(grid);

        return json;
    }

    /**
     * create pagination data
     * @param dataList
     * @param page
     * @param rows
     * @return
     */
    public List<?>  createPaginationData(List<?> dataList,int page, int rows){
        if(rows < dataList.size()){
            if(page == 1){
                dataList = dataList.subList(0, page*rows);
            }else{
                if(page*rows <= dataList.size()){
                    dataList = dataList.subList((page-1)*10, page*rows);
                }else{
                    dataList = dataList.subList((page-1)*10,dataList.size());
                }
            }
        }
        return dataList;
    }

    /**
     * query data by specified conditions
     * @param request
     * @return
     */
    @SuppressWarnings("unchecked")
	@RequestMapping(value="/query", method = RequestMethod.GET)
    public ModelAndView querySelectValue(HttpServletRequest request){
        String selectedVal  =  request.getParameter("selectValue");
        List<String> sourceList = new ArrayList<String>();
        List<String> detailList = new ArrayList<String>();

        if ("app".equals(selectedVal)){
            sourceList = appService.getSources();
            detailList = appService.getSourceDetails();
        }else if("flow".equals(selectedVal)) {
            sourceList = flowService.getSources();
            detailList = flowService.getSourceDetails();
        }else if("pc".equals(selectedVal)){
            sourceList = pcService.getSources();
            detailList = pcService.getSourceDetails();
        }

        ModelAndView model = new ModelAndView();
        model.addObject("selectedVal",selectedVal);
        model.addObject("sourceList",sourceList);
        model.addObject("detailList",detailList);
        model.setViewName("search");
        return model;
    }

    /**
     * returns search data via search conditions
     * @param searchCondition
     * @return
     */
    public List<?> createSearchData(SearchCondition searchCondition) {
        String source = searchCondition.getSource();
        String dateTime = searchCondition.getDate();

        List<?> dataList = null;
        if("pc".equalsIgnoreCase(source)) { //condition:pc
            if (dateTime != null && dateTime.length() !=0){
                dataList = pcService.getDataByDate(searchCondition);
            }else{
                dataList = pcService.getDataByCondition(searchCondition);
            }

        } else if ("app".equalsIgnoreCase(source)) { //condition:app
            if (dateTime != null && dateTime.length() != 0) {
                dataList = appService.getDataByDate(searchCondition);
            }else{
                dataList = appService.getDataByCondition(searchCondition);
            }
        } else {                                    //condition:flow
            if (dateTime != null && dateTime.length() != 0) {
                dataList = flowService.getDataByDate(searchCondition);
            }else{
                dataList = flowService.getDataByCondition(searchCondition);
            }
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
