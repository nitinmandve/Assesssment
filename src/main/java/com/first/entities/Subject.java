package com.first.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	
	private String subjectFirst;
	private String subjectSecond;
	private String subjectThird;
	private String subjectFourth;
	
	@ManyToOne
	private Student student;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int sId, String subjectFirst, String subjectSecond, String subjectThird, String subjectFourth,
			Student student) {
		super();
		this.sId = sId;
		this.subjectFirst = subjectFirst;
		this.subjectSecond = subjectSecond;
		this.subjectThird = subjectThird;
		this.subjectFourth = subjectFourth;
		this.student = student;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSubjectFirst() {
		return subjectFirst;
	}

	public void setSubjectFirst(String subjectFirst) {
		this.subjectFirst = subjectFirst;
	}

	public String getSubjectSecond() {
		return subjectSecond;
	}

	public void setSubjectSecond(String subjectSecond) {
		this.subjectSecond = subjectSecond;
	}

	public String getSubjectThird() {
		return subjectThird;
	}

	public void setSubjectThird(String subjectThird) {
		this.subjectThird = subjectThird;
	}

	public String getSubjectFourth() {
		return subjectFourth;
	}

	public void setSubjectFourth(String subjectFourth) {
		this.subjectFourth = subjectFourth;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	

	


	


	

	
	
	
	 

}
