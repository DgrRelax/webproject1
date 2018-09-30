package com.dgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dgr.model.Users;
import com.dgr.service.UserService;
@Controller
public class UserController {

	/**
	 * Start access home page
	 * @return
	 */
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@Autowired
	private UserService userService;
	
	public List<Users> queryall(){
		return userService.queryall();
	}
	
	
}
