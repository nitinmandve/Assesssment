package com.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
