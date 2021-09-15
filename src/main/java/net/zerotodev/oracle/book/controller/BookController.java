package net.zerotodev.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.zerotodev.oracle.book.domain.BookDto;
import net.zerotodev.oracle.book.service.BookService;
import net.zerotodev.oracle.common.GenericInterface;


@Controller
@RequestMapping(value = "/books")
public class BookController{

	@Autowired BookService bookService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(BookDto book) {
		bookService.save(book);
		return "redirect:/move/book/List";
		
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public BookDto findById(@RequestParam(name = "bookId")Integer bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
		return book;
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public List<BookDto> findAll() {
		List<BookDto> books = bookService.findAll();
		for (BookDto book : books) {
			System.out.println(book.toString());
		}
		return bookService.findAll();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(BookDto book) {
		bookService.update(book);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void delete(@PathVariable Integer id) {
		bookService.delete(id);
	}

	
	
	
}
