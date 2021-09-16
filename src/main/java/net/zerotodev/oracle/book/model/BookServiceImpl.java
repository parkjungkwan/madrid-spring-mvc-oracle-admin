package net.zerotodev.oracle.book.model;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zerotodev.oracle.common.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookMapper;

	@Override
	public void save(BookDto book) {
		bookMapper.save(book);
	}

	@Override
	public BookDto findById(Integer bookId) {
		return bookMapper.findById(bookId);
	}

	@Override
	public List<BookDto> findAll() {
		return bookMapper.findAll();
	}

	@Override
	public void update(BookDto book) {
		bookMapper.update(book);
	}

	@Override
	public void delete(Integer bookId) {
		bookMapper.delete(bookId);
	}

}



