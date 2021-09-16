package net.zerotodev.oracle.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.book.model.BookDto;
import net.zerotodev.oracle.common.service.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer>{
	
	public List<BookDto> findByBookTitle(String title);
	public List<BookDto> findByPrice(String price);
	public List<BookDto> findByPubId(String pubId);
}
