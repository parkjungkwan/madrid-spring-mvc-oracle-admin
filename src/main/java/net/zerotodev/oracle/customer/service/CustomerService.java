package net.zerotodev.oracle.customer.service;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService {

	void save(CustomerDto customer);



}
