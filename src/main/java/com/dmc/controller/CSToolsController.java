package com.dmc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dmc.domain.Flow;
import com.dmc.domain.TableColumn;
import com.dmc.services.FlowService;
import com.google.gson.Gson;

/**
 * Created by xiaobianchen on 15/9/21.
 * This class is used to provide a tools for customer to query data from database
 */
@Controller
@SessionAttributes("flow")
@RequestMapping(value="/csTools")
public class CSToolsController {

    @Autowired
    private FlowService flowService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list(){
        List<Flow> flowList = flowService.listAll();
        ModelAndView model = new ModelAndView();
        model.addObject(flowList);
        model.setViewName("queryAll");
        return model;
    }
    
    @RequestMapping(value="/pagination", method=RequestMethod.GET)
    public @ResponseBody String getPaginationDataTable(HttpServletRequest request) throws Exception{
    	//Fetch the page number from client
    	Integer pageNumber = 0;
    	if (null != request.getParameter("iDisplayStart"))
    		pageNumber = (Integer.valueOf(request.getParameter("iDisplayStart"))/10)+1;	
    	
    	String searchParameter = request.getParameter("sSearch");
    	Integer pageDisplayLength = Integer.valueOf(request.getParameter("iDisplayLength"));
    	
    	List<Flow> flowList = createPaginationData(pageDisplayLength,pageNumber);
    	flowList = getListBasedSearchParameter(searchParameter,flowList);
    	
    	int size = flowService.listAll().size();
    	TableColumn tableColumn = new TableColumn();
    	tableColumn.setiTotalDisplayRecords(size);
    	tableColumn.setiTotalRecords(size);
    	tableColumn.setAaData(flowList);
    	
    	Gson gson = new Gson();
    	String json = gson.toJson(tableColumn);
    	return json;
    }

    public List<Flow> getListBasedSearchParameter(String searchParameter,List<Flow> flowList) {
    	List<Flow> searchList = new ArrayList<Flow>();
    	if(null != searchParameter && !searchParameter.equals("")){
    		searchList = new ArrayList<Flow>();
			for(Flow flow:flowList){
				if(flow.getMerchantName().equalsIgnoreCase(searchParameter)||flow.getDate().equalsIgnoreCase(searchParameter)
						||flow.getSource().equalsIgnoreCase(searchParameter) || flow.getSourceDetails().equalsIgnoreCase(searchParameter) || String.valueOf(flow.getAccessNum()).indexOf(searchParameter)!=-1){
					
					searchList.add(flow);
				}
			}
			
			flowList = searchList;
			searchList = null;
    	}
			
		return flowList;
	}

	/**
     * 
     * @param pageDisplayLength
     * @return
     */
	public List<Flow> createPaginationData(Integer pageDisplayLength,Integer pageNumber) {
		List<Flow> flowList = flowService.listAll();
		if (pageDisplayLength < flowList.size()) {
			if(pageNumber==1){
				flowList = flowList.subList(0, pageNumber*pageDisplayLength);
			}else{
				if(pageNumber*pageDisplayLength <= flowList.size()){
					flowList = flowList.subList((pageNumber-1)*10, pageNumber*pageDisplayLength);
				}else{
					flowList = flowList.subList((pageNumber-1)*10, flowList.size());
				}
			}
		}
		return flowList;
	}
}
