package com.dmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dmc.domain.entity.Login;
import com.dmc.domain.entity.ResetPassword;
import com.dmc.services.UserService;
import com.dmc.utils.RandomUtils;

import javax.servlet.http.HttpSession;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月11日
 * Login Page
 *
 */
@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	/**
	 * get login page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model,RedirectAttributes redirectAttributes){
		Login login = new Login();
		model.addAttribute("login", login);
		redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
		redirectAttributes.addAttribute("unitname", "login");
		return "redirect:/loginPage";
	}
	
	/**
	 * redirect to login page
	 * @return
	 */
	@RequestMapping(value="/loginPage", method=RequestMethod.GET)
	public String signIn(){
		return "login";
	}
	
	/**
	 * Verify UserName And Password
	 * @param login
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody String login(@ModelAttribute("login") Login login,HttpSession session){
		boolean isExist = userService.getUserByLogin(login.getUsername(), login.getPassword());
		if(isExist){
			session.setAttribute("login",login);
			return "success";
		}else{
			return "error";
		}
	}
	
	/**
	 * reset password
	 * @return
	 */
	@RequestMapping(value="/resetPwd", method=RequestMethod.GET)
	public String resetPwd(Model model){
		ResetPassword resetpwd = new ResetPassword();
		model.addAttribute("resetpwd", resetpwd);
		return "reset";
	}
	
	/**
	 * modify password
	 * @param reset
	 * @return
	 */
	@RequestMapping(value="/resetPwd", method=RequestMethod.POST)
	public @ResponseBody String getUserByPassword(@ModelAttribute("resetpwd") ResetPassword reset){
		boolean isFound = userService.getUserByLogin(reset.getUsername(), reset.getOldPassword());
		if(isFound){
			//the user is exist and username/password is correct, then can reset password
			userService.updateUser(reset);
			return "success";
		}else{
			return "error";
		}
	}
}
