package com.dmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dmc.domain.Comment;
import com.dmc.services.CommentService;

/**
 * 
 * Created by Xiaobian Chen on 2015ÄêÔÂ23ÈÕ
 *
 *
 */
@Controller
@SessionAttributes("comment")
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
		if(comment!=null){
			commentService.insert(comment);
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView list(){
		List<Comment> commentList = commentService.list();
		ModelAndView model = new ModelAndView();
		model.addObject(commentList);
		model.setViewName("listComments");
		return model;
	}
	
}
