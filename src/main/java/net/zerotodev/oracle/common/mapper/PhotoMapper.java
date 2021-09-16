package net.zerotodev.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.service.GenericInterface;
import net.zerotodev.oracle.photo.model.PhotoDto;

@Repository
public interface PhotoMapper extends GenericInterface<PhotoDto, Integer> {
	List<PhotoDto> findAll2();
}
