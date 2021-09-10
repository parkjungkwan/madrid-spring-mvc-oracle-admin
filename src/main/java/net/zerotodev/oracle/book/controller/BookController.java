package net.zerotodev.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import net.zerotodev.oracle.book.domain.BookDto;
import net.zerotodev.oracle.book.service.BookService;
import net.zerotodev.oracle.mappers.BookMapper;

@Controller
public class BookController {

	@Autowired BookService bookService;
	
	public void findAll() {
		List<BookDto> list = bookService.findAll();
		for(BookDto b : list) {
			System.out.println(b.toString());
		}
		
	}

}
