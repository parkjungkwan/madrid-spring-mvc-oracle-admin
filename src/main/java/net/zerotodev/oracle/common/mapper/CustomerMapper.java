package net.zerotodev.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.service.GenericInterface;
import net.zerotodev.oracle.customer.model.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	List<CustomerDto> findByCustName(String custName);
	List<CustomerDto> findByAddress(String address);
	List<CustomerDto> findByPhone(String phone);
}
