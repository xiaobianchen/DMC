package com.dmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dmc.domain.Comment;
import com.dmc.services.CommentService;

/**
 * 
 * Created by Xiaobian Chen on 2015��6��23��
 *
 *
 */
@Controller
@SessionAttributes("comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value="/comment", method=RequestMethod.GET)
	public String comment(Model model){
		Comment comment = new Comment();
		model.addAttribute("comment", comment);
		return "comment";
	}
}
