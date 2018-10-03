package com.dgr.dao;

import java.util.List;

import com.dgr.model.User;


public interface OrdersMapper {
	//订单查询，关联用户信息
	public List<User> findOrdersUser();
}
