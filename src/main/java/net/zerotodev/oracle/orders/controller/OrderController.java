package net.zerotodev.oracle.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import net.zerotodev.oracle.IController;
import net.zerotodev.oracle.orders.domain.OrderDto;
import net.zerotodev.oracle.orders.service.OrderService;

@Controller
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	public String save(Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<?> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public String update(Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
