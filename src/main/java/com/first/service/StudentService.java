package com.first.service;

import java.util.List;


import com.first.entities.Student;
import com.first.entities.Subject;

public interface StudentService {
	
	public Student saveStudent(Student student);

	public List<Student> getAllEmp();
	
	
	
	
}
