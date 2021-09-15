package net.zerotodev.oracle.photo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.zerotodev.oracle.photo.domain.PhotoDto;
import net.zerotodev.oracle.photo.service.PhotoService;

@Controller
@RequestMapping("/photos")
public class PhotoController {
	@Autowired PhotoService photoService;
	@Autowired PhotoDto photo;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String save(PhotoDto t) {
		photoService.save(t);
		return "저장성공";
	}

	@RequestMapping("/find")
	public String findById(@RequestParam("phtoId") Integer phtoId) {
		System.out.println(photoService.findById(phtoId));
		return "id로 조회";
	}

	@RequestMapping
	public String findAll() {
		List<PhotoDto> photos = photoService.findAll();
		for (PhotoDto photo : photos) {
			System.out.println("사진정보 : "+ photo.toString());
		}
		return "목록 조회";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(PhotoDto t) {
		photoService.update(t);
		return "수정성공";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("photoId") Integer photoId) {
		photoService.delete(photoId);
		return "삭제 성공";
	}

}
