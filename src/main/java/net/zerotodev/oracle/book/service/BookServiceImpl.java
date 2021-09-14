package net.zerotodev.oracle.book.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zerotodev.oracle.book.domain.BookDto;
import net.zerotodev.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookMapper;

	@Override
	public void save(BookDto t) {
	}

	@Override
	public BookDto findById(Integer id) {
		return null;
	}

	@Override
	public List<BookDto> findAll() {
		return null;
	}

	@Override
	public void update(BookDto t) {
		bookMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		bookMapper.delete(id);
	}

}



