package com.dgr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgr.dao.UserMapper;
import com.dgr.model.Users;
import com.dgr.service.UserService;
import com.dgr.utils.Utils;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper  userMapper;
	
	public List<Users> queryall() {
		return userMapper.queryall();
	}

	/**
	  * 使用表单直接提交的String 类型数据
	 */
	public Users login(String login,String password) {
		Users users = new Users();
		users.setPassword(password);
		if(Utils.checkTelephone(login)) {
			users.setTelephone(login);
		}else if(Utils.checkEmail(login)) {
			users.setEmail(login);
		}else {
			users.setUsername(login);
		}
		Users loginresult = userMapper.login(users);
		if(loginresult != null) {
			System.out.println(loginresult.toString());
			return loginresult;
		}
		return null;
	}

	/**
	 * 使用ajax 异步提交的
	 */
	public Users login2(Users users) {
		return userMapper.login(users);
	}
}
