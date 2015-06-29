package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ11ÈÕ
 * Index Page
 *
 */
@Controller
public class IndexController {
	
	/**
	 * This is index page in DMC
	 * @return index page
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "index";
	}
}
