package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dmc.utils.RandomUtils;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月11日
 * Home Page
 * This class is used to handle home page
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	/**
	 * Home Page to DMC
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String home(ModelMap model,RedirectAttributes redirectAttributes){
		model.addAttribute("message", "Welcome to DMC");
		redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
		redirectAttributes.addAttribute("unitname","index");
		return "redirect:/index";
	}

}
