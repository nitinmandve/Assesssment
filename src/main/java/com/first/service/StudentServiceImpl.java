package com.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.entities.Student;
import com.first.entities.Subject;
import com.first.repository.StudentRepository;
import com.first.repository.SubjectRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public List<Student> getAllEmp() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		Student save = studentRepository.save(student);
		return save;
	}

	

}
