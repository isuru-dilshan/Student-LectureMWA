package com.nibm.sb.payroll.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nibm.sb.payroll.entity.Lecture;
import com.nibm.sb.payroll.repository.LectureRepository;
import com.nibm.sb.payroll.repository.StudentRepository;
import com.nibm.sb.payroll.service.LectureService;

@Service
public class LectureServiceImpl implements LectureService {
    
	private LectureRepository lectureRepository;
	
	public LectureServiceImpl(LectureRepository lectureRepository) {
		super();
		this.lectureRepository = lectureRepository;
	}
	
	@Override
	public List<Lecture> getAllLectures() {
		
		return lectureRepository.findAll();
	}

	@Override
	public Lecture saveLecture(Lecture lecture) {
		return lectureRepository.save(lecture) ;
	}

	@Override
	public Lecture getLectureById(Long id) {
		return lectureRepository.findById(id).get();
	}

	@Override
	public Lecture updateLecture(Lecture lecture) {
		return lectureRepository.save(lecture);
	}

	@Override
	public void deleteLectureById(Long id) {
		lectureRepository.deleteById(id);
		
	}

}

