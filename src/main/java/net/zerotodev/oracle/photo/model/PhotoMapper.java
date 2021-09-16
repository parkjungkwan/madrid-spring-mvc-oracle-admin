package net.zerotodev.oracle.photo.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.zerotodev.oracle.common.GenericInterface;

@Repository
public interface PhotoMapper extends GenericInterface<PhotoDto, Integer> {
	List<PhotoDto> findAll2();
}
