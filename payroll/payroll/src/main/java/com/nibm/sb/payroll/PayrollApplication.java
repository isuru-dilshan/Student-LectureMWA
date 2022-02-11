package com.nibm.sb.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nibm.sb.payroll.entity.Lecture;
import com.nibm.sb.payroll.entity.Student;
import com.nibm.sb.payroll.repository.LectureRepository;
import com.nibm.sb.payroll.repository.StudentRepository;

@SpringBootApplication
public class PayrollApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}
	
    @Autowired
    private StudentRepository studentRepository;
    
    
	@Override
	public void run(String... args) throws Exception {
		
	/*	
	*	Student student1 = new Student("Isuru", "Dilshan", "isuru@gmail.com");
	*	studentRepository.save(student1);
		
	*	Student student2 = new Student("Sunil","Perera","sunil@gmail.com");
	*	studentRepository.save(student2);
		
	*	Student student3 = new Student("Kamal","Thisera","kamal@gmail.com");
	*	studentRepository.save(student3);
		
		*/
	/*	
		*Lecture lecture1 = new Lecture("Supun", "Piumal", "supun@gmail.com");
		*lectureRepository.save(lecture1);
		
		*Lecture lecture2 = new Lecture("Kamal", "Dilshan", "kamal@gmail.com");
		*lectureRepository.save(lecture2);
		
		*Lecture lecture3 = new Lecture("Nipun", "Suresh", "nipun@gmail.com");
		*lectureRepository.save(lecture3);
		*/
		
	}

}
