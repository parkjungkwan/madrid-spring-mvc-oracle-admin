package net.zerotodev.oracle.mappers;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper {

	void save(OrderDto order);

}
