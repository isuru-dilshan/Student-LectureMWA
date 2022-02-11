package com.nibm.sb.payroll.service;

import java.util.List;

import com.nibm.sb.payroll.entity.Lecture;

public interface LectureService {
	
     List<Lecture> getAllLectures();
     
     Lecture saveLecture( Lecture lecture);
     
     Lecture getLectureById(Long id);
     
     Lecture updateLecture(Lecture lecture);
     
     void deleteLectureById(Long id);
     
}
