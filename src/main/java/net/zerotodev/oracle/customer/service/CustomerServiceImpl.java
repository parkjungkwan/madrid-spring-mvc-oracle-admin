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
	public String save(CustomerDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(CustomerDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
