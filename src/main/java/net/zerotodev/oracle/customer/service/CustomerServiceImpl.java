package net.zerotodev.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zerotodev.oracle.customer.domain.CustomerDto;
import net.zerotodev.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired CustomerMapper mapper;

	@Override
	public void save(CustomerDto t) {
	}

	@Override
	public CustomerDto findById(Integer id) {
		return null;
	}

	@Override
	public List<CustomerDto> findAll() {
		return null;
	}

	@Override
	public void update(CustomerDto t) {
	}

	@Override
	public void delete(Integer id) {
	}

	

}
