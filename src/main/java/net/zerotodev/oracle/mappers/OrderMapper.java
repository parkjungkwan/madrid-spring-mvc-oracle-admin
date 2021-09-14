package net.zerotodev.oracle.mappers;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.orders.domain.OrderDto;

@Repository
public interface OrderMapper {

	void save(OrderDto order);

}
