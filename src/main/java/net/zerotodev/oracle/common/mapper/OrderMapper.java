package net.zerotodev.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.service.GenericInterface;
import net.zerotodev.oracle.order.model.OrderDto;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer> {
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(int orderPrice);
	public List<OrderDto> findByOrderDate(String orderDate);
}
