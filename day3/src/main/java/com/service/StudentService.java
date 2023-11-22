package com.service;

import java.util.List;
import java.util.Optional;

import com.model.Student;

public interface StudentService {
	Student addStu(Student stu);

	List<Student> getAllStu();

	Optional<Student> getStu(long parseLong);

	Student updateStu(Student emp);

	String deleteStu(long parseLong);
}
