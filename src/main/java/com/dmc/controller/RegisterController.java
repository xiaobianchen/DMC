package com.dmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.dmc.domain.User;
import com.dmc.services.UserService;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ11ÈÕ
 * Register Page
 *
 */
@Controller
@SessionAttributes("user")
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Model model){
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public @ResponseBody  String signup(@ModelAttribute("user") User user,Model model){
		userService.insert(user);
		return "index";
	}

}
