package com.dmc.controller;

import com.dmc.domain.Source;
import com.dmc.services.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/10/22
 */
@Controller
@RequestMapping(value="/cstools")
public class SearchController {

    @Autowired
    private FlowService flowService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView searchDataByConditions() {
        List<Source> sourceList = flowService.queryList();
        ModelAndView model = new ModelAndView();
        model.addObject("sourceList",sourceList);
        model.setViewName("search");
        return model;
    }

    @RequestMapping(value="/list")
    public String getDataByConditions(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(11);
        return "";
    }








}
