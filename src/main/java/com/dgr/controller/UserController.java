package com.dgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dgr.model.Users;
import com.dgr.service.UserService;
@Controller
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
	
	
}
