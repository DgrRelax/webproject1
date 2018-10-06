package com.dgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dgr.model.Users;
import com.dgr.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/query")
	public String queryall(){
		List<Users> list = userService.queryall();
		for (Users users : list) {
			System.out.println(users.toString());
		}
		return "success";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView login(@RequestParam(name="login")String login,@RequestParam(name="password")String password) {
		System.out.println(login + " :::::: " + password);
		
		ModelAndView modelAndView = new ModelAndView();
		Users users = userService.login(login, password);
		modelAndView.addObject("user", users);
		modelAndView.setViewName("success");
		return modelAndView;
		
		/*返回空值没处理*/
	}
	
}
