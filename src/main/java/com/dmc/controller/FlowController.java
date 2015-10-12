package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月15日
 * Flow Page
 * This class is used to handle flow data
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
