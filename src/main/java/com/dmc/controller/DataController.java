package com.dmc.controller;

import com.dmc.domain.Flow;
import com.dmc.services.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by xiaobianchen on 15/9/21.
 */
@Controller
public class DataController {

    @Autowired
    private FlowService flowService;

    @RequestMapping(value="/queryTools", method = RequestMethod.GET)
    public ModelAndView queryAll(){
        List<Flow> flowList = flowService.listAll();
        System.out.println(flowList.size());
        ModelAndView model = new ModelAndView();
        model.addObject(flowList);
        model.setViewName("queryAll");
        return model;
    }
}
