package net.zerotodev.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.order.domain.OrderDto;
import net.zerotodev.oracle.order.service.OrderService;

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
