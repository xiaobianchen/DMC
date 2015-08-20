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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dmc.domain.Comment;
import com.dmc.domain.TableColumn;
import com.dmc.services.CommentService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
<<<<<<< HEAD
	public @ResponseBody String getFeedBack(@ModelAttribute("comment") Comment comment){
=======
	public @ResponseBody String getFeedBack(@ModelAttribute("comment") Comment comment) throws IOException{
>>>>>>> 8670870b25acb85f942d4834ffd5877274ff3095
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
<<<<<<< HEAD
	
	@RequestMapping(value="/pagination", method=RequestMethod.GET)
	public @ResponseBody String getPaginationDataTable(HttpServletRequest request){
		//fetch the page number from client
//		Integer pageNumber = 0;
//		if(null!=request.getParameter("iDisplayStart"))
//			pageNumber = (Integer.valueOf(request.getParameter("iDisplayStart"))/10)+1;
		
		//fetch search parameter
	    String searchParameter = request.getParameter("sSearch");
		
		//Fetch Page display length
    	Integer pageDisplayLength = Integer.valueOf(request.getParameter("iDisplayLength"));
		
    	List<Comment> commentList = createPaginationData(pageDisplayLength);
    	commentList = getListBasedSearchParameter(searchParameter,commentList);
		
    	TableColumn tableColumn = new TableColumn();
    	//set total display record
    	tableColumn.setiTotalDisplayRecords(100);
    	//set total record
    	tableColumn.setiTotalRecords(100);
    	tableColumn.setAaData(commentList);
		
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
    	String json = gson.toJson(tableColumn);
		
		return json;
	}

	/**
	 * This method is used to display records
	 * @param pageDisplayLength
	 * @return
	 */
	public List<Comment> createPaginationData(Integer pageDisplayLength) {
		List<Comment> commentList = commentService.list();
		if(pageDisplayLength > commentList.size()){
			commentList = commentList.subList(0, commentList.size());
		}else{
			commentList = commentList.subList(0, pageDisplayLength);
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
=======
>>>>>>> 8670870b25acb85f942d4834ffd5877274ff3095
}
