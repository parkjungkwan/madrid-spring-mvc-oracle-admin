package net.zerotodev.oracle.common;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface GenericInterface<T,U> {
	
	public String save(T t);
	public T findById(U id);
	public List<T> findAll();
	public String update(T t);
	public String delete(U id);

}
 