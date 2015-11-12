package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dmc.utils.RandomUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月11日
 * Index Page
 *
 */
@Controller
@SessionAttributes("login")
public class IndexController{
	
	/**
	 * This is index page in DMC
	 * @return index page
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(RedirectAttributes redirectAttributes){
		redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
		redirectAttributes.addAttribute("unitname", "index");
		return "redirect:/indexPage";
	}
	
	@RequestMapping(value="/indexPage", method=RequestMethod.GET)
	public String getIndex(){
		return "index";
	}

	@RequestMapping("*")
	public String handlePageNotFound(){
		return "404";
	}



}
