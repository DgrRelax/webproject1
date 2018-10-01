package com.dgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dgr.model.Users;
import com.dgr.service.UserService;
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	public List<Users> queryall(){
		return userService.queryall();
	}
	
	
}
