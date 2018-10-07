package com.dgr.service;

import java.util.List;

import com.dgr.model.Users;

public interface UserService {
	public List<Users> queryall();
	
	public Users login(String login,String password);
	
	public Users login2(Users users);
}
