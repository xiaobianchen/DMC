package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * Created by Xiaobian Chen on 2015��6��23��
 *
 *
 */
@Controller
public class Comment {
	
	@RequestMapping(value="/comment", method=RequestMethod.GET)
	public String sendComment(){
		return "comment";
	}
}
