package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiaobianchen
 * @version 1.0 2015/11/26
        * @link https://github.com/xiaobianchen/DMC
        * This page is used for testing
        */
@Controller
@RequestMapping(value="/welcome")
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
}
