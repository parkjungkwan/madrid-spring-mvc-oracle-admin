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
	public String save(BookDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(BookDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}



