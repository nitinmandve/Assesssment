package com.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
