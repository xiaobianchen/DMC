package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * Created by Xiaobian Chen on 2015��6��11��
 * Register Page
 *
 */
@Controller
public class RegisterController {
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return "register";
	}

}
