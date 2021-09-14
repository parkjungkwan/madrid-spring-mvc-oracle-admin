package net.zerotodev.oracle.common;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface GenericInterface<T> {
	
	public String save(T t);
	public T findById(String id);
	public List<T> findAll();
	public String update(T t);
	public String delete(String id);

}
 