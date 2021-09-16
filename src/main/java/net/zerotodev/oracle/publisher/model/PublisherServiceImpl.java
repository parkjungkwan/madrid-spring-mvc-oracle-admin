package net.zerotodev.oracle.publisher.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pubService")
public class PublisherServiceImpl implements PublisherService{

	@Autowired PublisherMapper publisherMapper;
	
	@Override
	public void save(PublisherDto t) {
		// TODO Auto-generated method stub
		publisherMapper.save(t);
		
	}

	@Override
	public PublisherDto findById(Integer id) {
		// TODO Auto-generated method stub
		return publisherMapper.findById(id);
	}

	@Override
	public List<PublisherDto> findAll() {
		// TODO Auto-generated method stub
		return publisherMapper.findAll();
	}

	@Override
	public void update(PublisherDto t) {
		// TODO Auto-generated method stub
		publisherMapper.update(t);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		publisherMapper.delete(id);
	}

	@Override
	public List<PublisherDto> findByName() {
		// TODO Auto-generated method stub
		return publisherMapper.findByName();
	}

	@Override
	public List<PublisherDto> findByMgrName() {
		// TODO Auto-generated method stub
		return publisherMapper.findByMgrName();
	}

	@Override
	public List<PublisherDto> findByPhone() {
		// TODO Auto-generated method stub
		return publisherMapper.findByphone();
	}

}
