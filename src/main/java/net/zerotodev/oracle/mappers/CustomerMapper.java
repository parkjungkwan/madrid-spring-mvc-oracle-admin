package net.zerotodev.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	List<CustomerDto> findByCustName(String custName);
	List<CustomerDto> findByAddress(String address);
	List<CustomerDto> findByPhone(String phone);
}
