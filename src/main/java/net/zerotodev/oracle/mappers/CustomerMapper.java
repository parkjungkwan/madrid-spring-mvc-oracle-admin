package net.zerotodev.oracle.mappers;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{


}
