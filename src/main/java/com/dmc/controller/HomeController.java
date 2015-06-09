package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author jchen19
   2015Äê6ÔÂ9ÈÕ
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(ModelMap model){
		model.addAttribute("message", "Welcome to DMC");
		return "home";
	}

}
