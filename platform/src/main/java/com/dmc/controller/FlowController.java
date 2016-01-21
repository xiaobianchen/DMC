package com.dmc.controller;

import com.dmc.RandomUtils;
import com.dmc.domain.ProcessData;
import com.dmc.services.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/6/15
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to handle flow data
 */
@Controller
public class FlowController {
	
	
	@Autowired
	private FlowService flowService;
	
	/**
	 * get flow page
	 * @return
	 */
	@RequestMapping(value="/flow",method=RequestMethod.GET)
	public String flow(RedirectAttributes redirectAttributes){
		redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
		redirectAttributes.addAttribute("unitname", "flow");
		return "redirect:/flowPage";
	}

	/**
	 * get process data
	 * @return
	 */
	@RequestMapping(value="/flowPage", method=RequestMethod.GET)
	public ModelAndView getProcessData(){
		List<ProcessData> dataList = flowService.queryProcessData();
		ModelAndView model = new ModelAndView();
		model.addObject("dataList",dataList);
		model.setViewName("flow");
		return model;
	}
	
}
