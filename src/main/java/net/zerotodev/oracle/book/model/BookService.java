package net.zerotodev.oracle.book.model;

import java.awt.print.Book;
import java.util.List;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.common.service.GenericInterface;
import net.zerotodev.oracle.customer.model.CustomerDto;

@Component
public interface BookService extends GenericInterface<BookDto, Integer>{
	

}
