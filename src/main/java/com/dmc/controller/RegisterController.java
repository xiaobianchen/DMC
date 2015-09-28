package com.dmc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Created by Xiaobian Chen on 2015/06/11
 * Register Page
 *
 */
@Controller
@SessionAttributes("user")
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * get register 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Model model){
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	/**
	 * sign up
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public @ResponseBody  String signup(@ModelAttribute("user") User user){
		boolean isUser = userService.getUserByUserName(user.getUsername());
		boolean isEmail = userService.getUserByEmail(user.getEmail());
		boolean isPhone = userService.getUserByPhone(user.getPhone());
		boolean isFlag = isUser||isEmail||isPhone;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String registerTime = sdf.format(new Date());
		user.setRegisterDate(registerTime);
		
		if(isFlag){
			return "error";
		}else{
			userService.insert(user);
			return "success";
		}
	}

	/**
	 * check user from database
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/checkUser", method=RequestMethod.POST)
	public @ResponseBody String checkUser(@ModelAttribute("user") User user){
		boolean isExist = userService.getUserByUserName(user.getUsername());
		if(isExist){
			return "success";
		}else{
			return "error";
		}
	}
	
	/**
	 * check email from database
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/checkEmail", method=RequestMethod.POST)
	public @ResponseBody String checkEmail(@ModelAttribute("user") User user){
		boolean isExist = userService.getUserByEmail(user.getEmail());
		if(isExist){
			return "success";
		}else{
			return "error";
		}
	}
	
	/**
	 * check phone from database
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/checkPhone", method=RequestMethod.POST)
	public @ResponseBody String checkPhone(@ModelAttribute("user") User user){
		boolean isExist = userService.getUserByPhone(user.getPhone());
		if(isExist){
			return "success";
		}else{
			return "error";
		}
	}
}
