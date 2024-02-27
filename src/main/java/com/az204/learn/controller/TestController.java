package com.az204.learn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.az204.learn.dtos.Student;

@RestController
@CrossOrigin("*")
public class TestController {

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setName("Student One");
		student1.setRollNumber(101L);
		
		Student student2 = new Student();
		student2.setName("Student Two");
		student2.setRollNumber(102L);
		students.add(student1);
		students.add(student2);
		return ResponseEntity.ok(students);
	}
}
