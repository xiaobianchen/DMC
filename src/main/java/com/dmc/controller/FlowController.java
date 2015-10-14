package com.dmc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.dmc.domain.ProcessData;
import com.dmc.services.FlowService;
import com.dmc.utils.RandomUtils;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月15日
 * Flow Page
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
	
	@RequestMapping(value="/flowPage", method=RequestMethod.GET)
	public ModelAndView getProcessData(){
		List<ProcessData> dataList = flowService.queryProcessData();
		ModelAndView model = new ModelAndView();
		model.addObject("dataList",dataList);
		model.setViewName("flow");
		return model;
	}
	
}
