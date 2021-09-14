package net.zerotodev.oracle.book.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.book.domain.BookDto;
import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.customer.domain.CustomerDto;

@Component
public interface BookService extends GenericInterface<BookDto, Integer>{
	

}
