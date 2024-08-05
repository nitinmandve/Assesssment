package com.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.entities.Subject;
import com.first.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public Subject saveStudent(Subject student) {
		
		Subject subject = subjectRepository.save(student);
		
		return subject;
	}

	@Override
	public List<Subject> getAllEmp() {
		
		return subjectRepository.findAll();
	}

}
