package com.dmc.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dmc.utils.RandomUtils;

/**
 * @author xiaobianchen
 * @version 1.0 2015/6/11
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to handle home page
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    /**
     * spring quartz to trigger task
     */
    static {
        new ClassPathXmlApplicationContext("spring_quartz.xml");
    }

    /**
     * Home Page to DMC
     * @param model
     * @return home page
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model, RedirectAttributes redirectAttributes) {
        model.addAttribute("message", "Welcome to DMC");
        redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
        redirectAttributes.addAttribute("unitname", "index");
        return "redirect:/index";
    }

}
