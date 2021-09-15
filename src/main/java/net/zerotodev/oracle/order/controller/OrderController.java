package net.zerotodev.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.zerotodev.oracle.order.domain.OrderDto;
import net.zerotodev.oracle.order.service.OrderService;

@RequestMapping("/orders")
@Controller
public class OrderController{

	@Autowired OrderService orderService;
	@Autowired OrderDto orderDto;
	
	@RequestMapping(value="/order", method= RequestMethod.POST)
	public String save(OrderDto t) {
		orderService.save(t);
		return "Save Success";	}

	@RequestMapping("/detail")
	public OrderDto findById(Integer orderId) {
		OrderDto dto = orderService.findById(orderId);
		System.out.println(dto.toString());
		return dto;
	}

	@RequestMapping("/list")
	public void findAll() {
		List<OrderDto> list = orderService.findAll();
		for(OrderDto o : list) {System.out.println(o.toString());}
	}

	@RequestMapping(value="/update", method= {RequestMethod.POST})
	public String update(OrderDto orderId) {
		orderService.update(orderId);
		return "update Success";
	}

	@RequestMapping("/delete")
	public void delete(Integer orderId) {
		orderService.delete(orderId);
	}

	@RequestMapping("/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findByBookId(bookId);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/orderPrice/{orderPrice}")
	public void findByOrderPrice(@PathVariable int orderPrice) {
		List<OrderDto> orders = orderService.findByOrderPrice(orderPrice);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/orderDate/{orderDate}")
	public void findByOrderDate(@PathVariable String orderDate) {
		List<OrderDto> orders = orderService.findByOrderDate(orderDate);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	
	}
}
