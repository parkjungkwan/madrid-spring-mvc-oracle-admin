package net.zerotodev.oracle;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface IController {
	
	public String save(@RequestBody Object o);
	public Object findById(String id);
	public List<?> findAll();
	public String update(@RequestBody Object o);
	public String delete(String id);

}
