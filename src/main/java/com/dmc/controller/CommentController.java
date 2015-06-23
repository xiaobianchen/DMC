package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dmc.domain.Comment;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ23ÈÕ
 *
 *
 */
@Controller
public class CommentController {
	
	@RequestMapping(value="/comment", method=RequestMethod.GET)
	public String comment(Model model){
		Comment comment = new Comment();
		model.addAttribute("comment", comment);
		return "comment";
	}
	
	@RequestMapping(value="/comment", method=RequestMethod.POST)
	public String submitComment(@ModelAttribute("comment") Comment comment){
		
		
		return "";
	}
	
	
}
