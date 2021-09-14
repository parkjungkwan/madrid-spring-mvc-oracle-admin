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
		mapper.save(t);
	}

	@Override
	public CustomerDto findById(Integer id) {
		return mapper.findById(id);
	}

	@Override
	public List<CustomerDto> findAll() {
		return mapper.findAll();
	}

	@Override
	public void update(CustomerDto t) {
		mapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);
	}

	

}
