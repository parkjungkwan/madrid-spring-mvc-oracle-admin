package net.zerotodev.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.service.GenericInterface;
import net.zerotodev.oracle.publisher.model.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer>{

	public List<PublisherDto> findByName();

	public List<PublisherDto> findByMgrName();

	public List<PublisherDto> findByphone();

}
