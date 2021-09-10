package net.zerotodev.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.book.domain.BookDto;

@Repository
public interface BookMapper {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);

}
