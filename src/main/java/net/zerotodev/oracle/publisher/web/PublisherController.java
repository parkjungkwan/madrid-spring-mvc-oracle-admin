package net.zerotodev.oracle.publisher.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import net.zerotodev.oracle.publisher.model.PublisherDto;
import net.zerotodev.oracle.publisher.model.PublisherService;

@RequestMapping("/publishers")
@Controller
public class PublisherController {
	@Autowired PublisherService pubService;
	@Autowired PublisherDto pub;
	

	@RequestMapping (value = "/update", method = RequestMethod.POST)
	public String update(PublisherDto pub) {
		pubService.update(pub);
		return "redirect:/move/home/intro";
	}
	@RequestMapping ("/delete")
	public String delete(@RequestParam Integer pubId) {
		pubService.delete(pubId);
		return "redirect:/move/home/intro";
	}
	@RequestMapping (value = "/register", method = RequestMethod.POST)
	public String save(PublisherDto pub) {
		pubService.save(pub);
		System.out.println(pub);
		return "redirect:/move/home/intro";
	}
	@RequestMapping ("/list")
	public String list() {
		List<PublisherDto> pubs = pubService.findAll();
		for (PublisherDto publisher : pubs) {
			System.out.println(publisher.toString());
		}
		return "redirect:/move/home/intro";
	}
}
