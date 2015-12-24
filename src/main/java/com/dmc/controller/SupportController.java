package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiaobianchen on 2015/12/23.
 * This class is used to handle backend management
 */
@Controller
@RequestMapping(value = "/support")
public class SupportController {

    @RequestMapping(method = RequestMethod.GET)
    public String support(){
        return "support";
    }

    @RequestMapping(value="/log",method = RequestMethod.GET)
    public String log(){
        return "log";
    }


}
