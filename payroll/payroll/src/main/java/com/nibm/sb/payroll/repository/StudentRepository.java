package com.nibm.sb.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nibm.sb.payroll.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
