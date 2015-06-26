package com.dmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmc.domain.Login;
import com.dmc.services.UserService;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ11ÈÕ
 * Login Page
 *
 */
@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model){
		Login login = new Login();
		model.addAttribute("login", login);
		return "login";
	}
	
	/**
	 * Verify UserName And Password
	 * @param login
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody String login(@ModelAttribute("login") Login login){
		boolean isExist = userService.getUserByLogin(login.getUsername(), login.getPassword());
		if(isExist){
			return "success";
		}else{
			return "error";
		}
	}
}
