package com.dgr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgr.dao.UserMapper;
import com.dgr.model.Users;
import com.dgr.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper  userMapper;
	
	public List<Users> queryall() {
		return userMapper.queryall();
	}

}
