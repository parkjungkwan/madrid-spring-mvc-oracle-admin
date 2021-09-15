package net.zerotodev.oracle.photo.service;

import org.springframework.stereotype.Component;

import net.zerotodev.oracle.common.GenericInterface;
import net.zerotodev.oracle.photo.domain.PhotoDto;

@Component
public interface PhotoService extends GenericInterface<PhotoDto, Integer>{

}
