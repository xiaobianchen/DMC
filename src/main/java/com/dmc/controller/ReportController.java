package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/11/5
 * This class is used to display report for query data
 */
@Controller
@RequestMapping(value="/report")
public class ReportController {

    /**
     * report for the flow data
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String report(){
       return "report";
    }
}
