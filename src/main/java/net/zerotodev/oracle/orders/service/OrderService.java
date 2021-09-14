package net.zerotodev.oracle.orders.service;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.orders.domain.OrderDto;

@Component
public interface OrderService {

	void save(OrderDto order);

}
