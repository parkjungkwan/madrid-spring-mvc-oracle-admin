package net.zerotodev.oracle.order.service;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.order.domain.OrderDto;

@Component
public interface OrderService {

	void save(OrderDto order);

}
