package com.dgr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgr.dao.OrdersMapper;
import com.dgr.model.User;
import com.dgr.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersMapper ordersMapper;
	
	public List<User> findOrdersUser() {
		return ordersMapper.findOrdersUser();
	}

}
