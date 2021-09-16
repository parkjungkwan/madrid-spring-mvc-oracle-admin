package net.zerotodev.oracle.customer.model;

import java.util.List;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.common.service.GenericInterface;

@Component
public interface CustomerService extends GenericInterface<CustomerDto, Integer>{
	List<CustomerDto> findByCustName(String custName);
	List<CustomerDto> findByAddress(String address);
	List<CustomerDto> findByPhone(String phone);
}
