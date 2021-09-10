package net.zerotodev.oracle.book.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.book.domain.BookDto;

@Component
public interface BookService {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);

}
