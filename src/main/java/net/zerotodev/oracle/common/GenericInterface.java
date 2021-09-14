package net.zerotodev.oracle.common;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface GenericInterface<T,U> {
	
	public void save(T t);
	public T findById(U id);
	public List<T> findAll();
	public void update(T t);
	public void delete(U id);

}
 