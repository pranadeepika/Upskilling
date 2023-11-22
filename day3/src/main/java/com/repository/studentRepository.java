package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Student;

public interface studentRepository extends MongoRepository<Student, Long> {

}

