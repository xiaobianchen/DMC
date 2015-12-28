package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/23
 * @link https://github.com/xiaobianchen/DMC
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
