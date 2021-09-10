package net.zerotodev.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.zerotodev.oracle.book.domain.BookDto;
import net.zerotodev.oracle.book.service.BookService;
import net.zerotodev.oracle.mappers.BookMapper;

@Controller
public class BookController {

	@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll() {
		List<BookDto> list = bookService.findAll();
		for(BookDto b : list) {
			System.out.println(b.toString());
		}
		
	}

}
