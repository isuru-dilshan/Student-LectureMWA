package com.nibm.sb.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nibm.sb.payroll.entity.Lecture;


public interface LectureRepository extends  JpaRepository<Lecture, Long> {
	
	

}
