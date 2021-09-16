package net.zerotodev.oracle.book.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer>{
	
	public List<BookDto> findByBookTitle(String title);
	public List<BookDto> findByPrice(String price);
	public List<BookDto> findByPubId(String pubId);
}
