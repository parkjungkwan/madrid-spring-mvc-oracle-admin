package net.zerotodev.oracle.publisher.model;

import java.util.List;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.common.GenericInterface;

@Component
public interface PublisherService extends GenericInterface<PublisherDto, Integer>{
	public List<PublisherDto> findByName();
	public List<PublisherDto> findByMgrName();
	public List<PublisherDto> findByPhone();

}
