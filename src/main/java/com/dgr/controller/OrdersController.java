package com.dgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dgr.model.OrderDetail;
import com.dgr.model.Orders;
import com.dgr.model.User;
import com.dgr.service.OrdersService;

@Controller
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping(value="/OrdersCustom")
	public String findOrdersUser() {
		List<User> list = ordersService.findOrdersUser();
		for (User user : list) {
			System.out.println("user::::::" + user.toString());
			List<Orders> ordersList = user.getOrdersList();
			for (Orders orders : ordersList) {
				System.out.println("orders:::::::"+orders.toString());
				List<OrderDetail> orderdetails = orders.getOrderdetails();
				for (OrderDetail orderDetail : orderdetails) {
					System.out.println("orderDetail::::::::"+orderDetail.toString());
				}
			}
		}
		return "success";
	}
	
	
}
