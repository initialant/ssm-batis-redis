package com.xxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xxx.pojo.User;
import com.xxx.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/queryUserById/{id}")
	public ModelAndView queryUserById(@PathVariable("id") int id) {
		User user = userService.queryUserById(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", user);
		mav.setViewName("user_list");
		return mav;
	}

	@RequestMapping("/checkUser")
	public ModelAndView checkUser(String name,String password) {
		User user = userService.queryUserByName(name);
		if(password.equals(user.getPassword())){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("main");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView();
			mav.addObject("message", "用户或密码错误");
			mav.addObject("user", user);
			mav.setViewName("login");
			return mav;
		}
	}
}
