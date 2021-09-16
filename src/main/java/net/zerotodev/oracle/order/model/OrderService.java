package net.zerotodev.oracle.order.model;

import java.util.List;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.common.GenericInterface;

@Component
public interface OrderService extends GenericInterface<OrderDto, Integer> {
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(int orderPrice);
	public List<OrderDto> findByOrderDate(String orderDate);
}
