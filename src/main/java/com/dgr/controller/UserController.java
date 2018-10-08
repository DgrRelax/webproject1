package com.dgr.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dgr.model.Users;
import com.dgr.service.UserService;

@SessionAttributes(value="user")
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
	
	/*
	//表单直接提交
	@RequestMapping(value="/login1", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam(name="login")String login,@RequestParam(name="password")String password) {
		System.out.println(login + " :::::: " + password);
		
		ModelAndView modelAndView = new ModelAndView();
		Users users = userService.login(login, password);
		if(users == null) {
			modelAndView.setViewName("error");
			return modelAndView;
		}
		modelAndView.addObject("user", users);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	*/
	
	// ajax 提交
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Users login(Users users,ModelMap modelMap,HttpSession session) {
		Users login2 = userService.login2(users);
		
		// 存入session  方式一  在类中使用注解 @SessionAttributes(value="user")
		modelMap.addAttribute("user", login2);
		
		// 第二种方式，引入servlet.api 形参中创建 HttpSession 
		/* session.setAttribute(name, value); */
		
		return login2;
	}
	
	@RequestMapping(value="/ajax")
	public String success() {
		return "success";
	}
	
	
}
