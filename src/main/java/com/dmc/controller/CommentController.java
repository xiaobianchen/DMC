package com.dmc.controller;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dmc.domain.entity.Comment;
import com.dmc.domain.entity.TableColumn;
import com.dmc.services.CommentService;
import com.dmc.utils.RandomUtils;
import com.google.gson.Gson;
/**
 * 
 * Created by Xiaobian Chen on 2015年6月23日
 * This class is used to handle feedback from customer and list comments
 */
@Controller
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	/**
	 * get feedback from customer
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/feedback", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	public String comment(Model model,RedirectAttributes redirectAttributes){
		Comment comment = new Comment();
		model.addAttribute("comment", comment);
		redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
		redirectAttributes.addAttribute("unitname", "feedback");
		return "redirect:/feedbackPage"; 
	}
	
	/**
	 * returns feedback page
	 * @return
	 */
	@RequestMapping(value="/feedbackPage", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	public String index(){
		return "comment";
	}
	
	/**
	 * submit feedback
	 * @param comment
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/feedback", method=RequestMethod.POST, produces="application/json;charset=utf-8")
	public String getFeedBack(HttpServletRequest request) throws IOException{
		Comment comment = new Comment();
		String comments = request.getParameter("comments");
		String type = request.getParameter("type");
		String contact = request.getParameter("contact");
		
		comment.setComments(comments);
		comment.setType(type);
		comment.setContact(contact);
		
		//reportTime
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String reportTime = sdf.format(new Date());
		comment.setReportTime(reportTime);
		
		commentService.insert(comment);
		return "redirect:/indexPage";
	}
	
	/**
	 * file upload
	 * @param comment
	 * @param file
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/upload", method=RequestMethod.POST, produces="application/json;charset=utf-8")
	public @ResponseBody String fileUpload(@ModelAttribute("comment") Comment comment) throws IOException{
		//reportTime
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String reportTime = sdf.format(new Date());
		comment.setReportTime(reportTime);
	
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
	@RequestMapping(value="/list", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	public String list(RedirectAttributes redirectAttributes){
		redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
		redirectAttributes.addAttribute("unitname", "comments");
		return "redirect:/listPage";
	}
	
	/**
	 * list comments
	 * @return
	 */
	@RequestMapping(value="/listPage",method=RequestMethod.GET, produces="application/json;charset=utf-8")
	public ModelAndView getList(){
		List<Comment> commentList = commentService.list();
		ModelAndView model = new ModelAndView();
		model.addObject(commentList);
		model.setViewName("listComments");
		return model;
	}

	/**
	 * pagination
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/pagination", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	public @ResponseBody String getPaginationDataTable(HttpServletRequest request){
		//fetch the page number from client
		Integer pageNumber = 0;
		if(null!=request.getParameter("iDisplayStart"))
			pageNumber = (Integer.valueOf(request.getParameter("iDisplayStart"))/10)+1;
		
		//fetch search parameter
	    String searchParameter = request.getParameter("sSearch");
		
		//Fetch Page display length
    	Integer pageDisplayLength = Integer.valueOf(request.getParameter("iDisplayLength"));
		
    	List<Comment> commentList = createPaginationData(pageDisplayLength,pageNumber);
    	commentList = getListBasedSearchParameter(searchParameter,commentList);
		
    	TableColumn tableColumn = new TableColumn();
    	int size = commentService.list().size();
    	//set total display record
		tableColumn.setiTotalDisplayRecords(size);
    	//set total record
    	tableColumn.setiTotalRecords(size);
    	tableColumn.setAaData(commentList);
		
    	Gson gson = new Gson();
    	String json = gson.toJson(tableColumn);
		
		return json;
	}

	/**
	 * This method is used to display records
	 * @param pageDisplayLength
	 * @return
	 */
	public List<Comment> createPaginationData(Integer pageDisplayLength,Integer pageNumber) {
		List<Comment> commentList = commentService.list();
		
		if(pageDisplayLength < commentList.size()){
			if(pageNumber == 1){
				commentList = commentList.subList(0, pageNumber*pageDisplayLength);
			}else{
				if(pageNumber*pageDisplayLength <= commentList.size()){
					commentList = commentList.subList((pageNumber-1)*10, pageNumber*pageDisplayLength);
				}else{
					commentList = commentList.subList((pageNumber-1)*10,commentList.size());
				}
			}
		}
		return commentList;
	}

	/**
	 * search by keywords
	 * @param searchParameter
	 * @param commentList
	 * @return
	 */
	public List<Comment> getListBasedSearchParameter(String searchParameter,List<Comment> commentList) {
		List<Comment> searchList = new ArrayList<Comment>();
		if(null != searchParameter && !searchParameter.equals("")){
			searchList = new ArrayList<Comment>();
			searchParameter = searchParameter.toUpperCase();
			for(Comment comment:commentList){
				if(String.valueOf(comment.getId()).toUpperCase().indexOf(searchParameter)!=-1 ||comment.getComments().toUpperCase().indexOf(searchParameter)!=-1 || comment.getContact().toUpperCase().indexOf(searchParameter)!=-1
						||comment.getType().toUpperCase().indexOf(searchParameter)!=-1 || comment.getReportTime().toUpperCase().indexOf(searchParameter)!=-1){
					searchList.add(comment);
				}
			}
			
			commentList = searchList;
			searchList = null;
		}
		
		return commentList;
	}
}
