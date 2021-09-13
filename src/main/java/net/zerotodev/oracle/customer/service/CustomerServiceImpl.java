package net.zerotodev.oracle.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zerotodev.oracle.customer.domain.CustomerDto;
import net.zerotodev.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired CustomerMapper mapper;

	@Override
	public void save(CustomerDto customer) {
		mapper.save(customer);
		
	}

}
