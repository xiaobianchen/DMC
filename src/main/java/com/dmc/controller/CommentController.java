package com.dmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmc.domain.Comment;
import com.dmc.services.CommentService;

/**
 * 
 * Created by Xiaobian Chen on 2015ÄêÔÂ23ÈÕ
 *
 *
 */
@Controller
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/feedback", method=RequestMethod.GET)
	public String comment(Model model){
		Comment comment = new Comment();
		model.addAttribute("comment", comment);
		return "comment";
	}
	
	/**
	 * 
	 * @param comment
	 * @return
	 */
	@RequestMapping(value="/feedback", method=RequestMethod.POST)
	public @ResponseBody String getFeedBack(@ModelAttribute("comment") Comment comment){
		commentService.insert(comment);
		return "success";
	}
}
