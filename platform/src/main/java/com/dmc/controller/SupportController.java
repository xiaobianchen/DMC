package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/23
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to handle backend management
 * some mongodb operations
 */
@Controller
@RequestMapping(value = "/support")
public class SupportController {

    public static Logger logger = Logger.getLogger(SupportController.class.getName());

    @RequestMapping(method = RequestMethod.GET)
    public String support() {
        return "support";
    }

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String log() {
        return "log";
    }
}
