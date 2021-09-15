package net.zerotodev.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.photo.domain.PhotoDto;

@Repository
public interface PhotoMapper extends GenericInterface<PhotoDto, Integer> {
	List<PhotoDto> findAll2();
}
