package com.nibm.sb.payroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nibm.sb.payroll.entity.Lecture;
import com.nibm.sb.payroll.service.LectureService;

@Controller
public class LectureController {
	
	private LectureService lectureService;

	public LectureController(LectureService lectureService) {
		super();
		this.lectureService = lectureService;
	}
	
	// handler method to handle list lecture and return mode and view
	@GetMapping("/lectures")
	public String listLectures(Model model) {
		model.addAttribute("lectures",lectureService.getAllLectures());
		return "lectures";
		
	}
	@GetMapping("lectures/new")
	public String createLectureForm(Model model) {
		
		//create lecture object to hold lecture from data
		Lecture lecture = new Lecture();
		model.addAttribute("lecture", lecture);
		return "create_lecture";
		
	}
	@PostMapping("/lectures")
	public String saveLecture(@ModelAttribute("lecture") Lecture lecture) {
		lectureService.saveLecture(lecture);
		return "redirect:/lectures";	
	}
	
	@GetMapping("/lectures/edit/{id}")
	public String editLectureForm(@PathVariable Long id,Model model) {
		model.addAttribute("lecture", lectureService.getLectureById(id));
		return "edit_lecture";
	}
	@PostMapping("/lectures/{id}")
	public String updateLecture(@PathVariable Long id, @ModelAttribute("lecture")Lecture lecture, Model model) {
		
		// get lecture  from database by id
		Lecture existingLecture = lectureService.getLectureById(id);
		existingLecture.setId(id);
		existingLecture.setFirstName(lecture.getFirstName());
		existingLecture.setLastName(lecture.getLastName());
		existingLecture.setEmail(lecture.getEmail());
		
		// save updated lecture object
		lectureService.updateLecture(existingLecture);
		return "redirect:/lectures";	
	}
	// handler method to handle delete lecture request
	@GetMapping("/lectures/{id}")
	public String deleteLecture(@PathVariable Long id) {
	 lectureService.deleteLectureById(id);
	 return "redirect:/lectures";
		
	}

}
