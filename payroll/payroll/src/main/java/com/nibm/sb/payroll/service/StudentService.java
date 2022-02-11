package com.nibm.sb.payroll.service;

import java.util.List;

import com.nibm.sb.payroll.entity.Student;

public interface StudentService {
      List<Student> getAllStudents();
      
      Student saveStudent(Student student);
      
      Student getStudentById(Long id);
      
      Student updateStudent(Student student);
      
      void deleteStudentById(Long id);
}
