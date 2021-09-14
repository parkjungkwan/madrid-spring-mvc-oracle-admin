package net.zerotodev.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.zerotodev.oracle.book.domain.BookDto;
import net.zerotodev.oracle.book.service.BookService;


@Controller
public class BookController {

	@Autowired BookService bookService;

	@RequestMapping("")
	public String save(BookDto t) {
		bookService.save(t);
		return "";
	}

	@RequestMapping("")
	public BookDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("")
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("")
	public String update(BookDto t) {
		// TODO Auto-generated method stub
		return "";
	}

	@RequestMapping("")
	public String delete(String id) {
		// TODO Auto-generated method stub
		return "";
	}
	
	
}
