package net.zerotodev.oracle.orders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zerotodev.oracle.mappers.OrderMapper;
import net.zerotodev.oracle.orders.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper orderMapper;

	@Override
	public void save(OrderDto order) {
		orderMapper.save(order);
	}

}
