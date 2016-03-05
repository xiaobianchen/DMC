package com.dmc.controller;

import com.dmc.RandomUtils;
import com.dmc.domain.User;
import com.dmc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiaobianchen
 * @version 1.0 2015/6/11
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to handle register operations
 *
 */
@Controller
@SessionAttributes("user")
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * get register page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Model model,RedirectAttributes redirectAttributes){
		User user = new User();
		model.addAttribute("user", user);
		redirectAttributes.addAttribute("redirectURL", RandomUtils.generateString(RandomUtils.stoken, 2));
		redirectAttributes.addAttribute("unitname", "register");
		return "redirect:/registerPage";
	}
	
	@RequestMapping(value="/registerPage", method=RequestMethod.GET)
	public String getRegister(){
		return "register";
	}
	
	/**
	 * sign up
	 * @param user
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public @ResponseBody  String signup(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		boolean isExist = userService.getUserByUserName(username);
//		boolean isPhone = userService.getUserByPhone(phone);
//		boolean isEmail = userService.getUserByEmail(email);
//		boolean isFlag = isUser||isEmail||isPhone;

		User user = new User();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String registerTime = sdf.format(new Date());
		user.setRegisterDate(registerTime);

		//if true return user is exist, else return insert new user
		if(isExist){
			return "error";
		}else{
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			user.setPhone(phone);
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
