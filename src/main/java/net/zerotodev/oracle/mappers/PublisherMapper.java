package net.zerotodev.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.publisher.domain.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer>{

	public List<PublisherDto> findByName();

	public List<PublisherDto> findByMgrName();

	public List<PublisherDto> findByphone();

}
