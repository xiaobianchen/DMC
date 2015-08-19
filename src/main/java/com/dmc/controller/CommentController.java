package com.dmc.controller;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dmc.domain.Comment;
import com.dmc.services.CommentService;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月23日
 * This class is used to handle feedback from customer and list comments
 */
@Controller
@SessionAttributes("comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	/**
	 * get feedback from customer
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
	 * submit feedback
	 * @param comment
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/feedback", method=RequestMethod.POST)
	public @ResponseBody String getFeedBack(@ModelAttribute("comment") Comment comment) throws IOException{
		//reportTime
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String reportTime = sdf.format(new Date());
		comment.setReportTime(reportTime);
		
		commentService.insert(comment);
		return "success";
	}
	
	/**
	 * file upload
	 * @param comment
	 * @param file
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public @ResponseBody String fileUpload(@ModelAttribute("comment") Comment comment,@RequestParam("file") final MultipartFile file) throws IOException{
		//reportTime
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String reportTime = sdf.format(new Date());
		comment.setReportTime(reportTime);
		comment.setFileName(file.getOriginalFilename());
		comment.setFileStream(file.getBytes());
		
		commentService.insert(comment);
		return "success";
	}
	
	/**
	 * list all comments
	 * passed list to jsp page:
	 * 1.invoke addObject() to add list to the ModelAndView
	 * 2.invoke setViewName(jsp page) to set jsp
	 * @return
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView list(){
		List<Comment> commentList = commentService.list();
		ModelAndView model = new ModelAndView();
		model.addObject(commentList);
		model.setViewName("listComments");
		return model;
	}
}
