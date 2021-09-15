package net.zerotodev.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer> {
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(int orderPrice);
	public List<OrderDto> findByOrderDate(String orderDate);
}
