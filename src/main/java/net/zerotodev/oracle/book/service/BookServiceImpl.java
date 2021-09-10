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
	public List<BookDto> findAll() {
		return bookMapper.findAll();
	}

}



