package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ15ÈÕ
 * Flow Page
 *
 */
@Controller
@RequestMapping("/flow")
public class FlowController {
	
	/**
	 * get flow page
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String flow(){
		return "flow";
	}

}
