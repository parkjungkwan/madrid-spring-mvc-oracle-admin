package net.zerotodev.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.zerotodev.oracle.book.domain.BookDto;
import net.zerotodev.oracle.book.service.BookService;
import net.zerotodev.oracle.common.GenericInterface;


@Controller
public class BookController{

	@Autowired BookService bookService;

	@RequestMapping("")
	public void save(BookDto t) {
		bookService.save(t);
		
	}

	@RequestMapping("")
	public BookDto findById(Integer id) {
		return bookService.findById(id);
	}

	@RequestMapping("")
	public List<BookDto> findAll() {
		return bookService.findAll();
	}

	@RequestMapping(value = "", method = RequestMethod.PUT)
	public void update(@RequestBody BookDto t) {
		bookService.update(t);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
		bookService.delete(id);
	}

	
	
	
}
