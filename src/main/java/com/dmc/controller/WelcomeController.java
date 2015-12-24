package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiaobianchen on 2015/11/26.
 *
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
