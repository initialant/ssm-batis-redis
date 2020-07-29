package com.xxx.controller;

import com.xxx.pojo.User;
import com.xxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/loginCheck")
	@ResponseBody
	public User loginCheck(String name,String password) {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		User userCheck = userService.userCheck(user);
		return userCheck; //返回查询结果
	}


	@RequestMapping("/ask")
	public ModelAndView askQuestion( String id) {
		int idd = Integer.parseInt(id);
		User user = userService.queryUserById(idd);
		ModelAndView mav = new ModelAndView ();
		mav.addObject("user",user);
		mav.setViewName("ask");
		return mav;
	}

	@RequestMapping("/regist")
	@ResponseBody
	@Transactional
	public User registCheck(String name,String password) {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		userService.addUser(user);
		return user; //返回查询结果
	}

	@RequestMapping("/updateTheUser")
	@ResponseBody
	@Transactional
	public User updateUser(String id,String password) {
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setPassword(password);
		userService.updateUser(user);
		user = userService.queryUserById(user.getId());
		return user; //返回查询结果
	}
}
