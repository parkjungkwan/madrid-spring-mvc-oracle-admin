package net.zerotodev.oracle.photo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zerotodev.oracle.mappers.PhotoMapper;
import net.zerotodev.oracle.photo.domain.PhotoDto;

@Service
public class PhotoServiceImpl implements PhotoService{
	@Autowired PhotoMapper photoMapper;
	
	@Override
	public void save(PhotoDto t) {
		photoMapper.save(t);
	}

	@Override
	public PhotoDto findById(Integer id) {
		return photoMapper.findById(id);
	}

	@Override
	public List<PhotoDto> findAll() {
		return photoMapper.findAll2();
	}

	@Override
	public void update(PhotoDto t) {
		photoMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		photoMapper.delete(id);
	}

}
