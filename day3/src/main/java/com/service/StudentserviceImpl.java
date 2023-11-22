package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.studentRepository;
@Service
public class StudentserviceImpl implements StudentService{
	@Autowired
	studentRepository studentRepository;

	@Override
	public Student addStu(Student emp) {
		return studentRepository.insert(emp);
	}

	@Override
	public List<Student> getAllStu() {
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStu(long parseLong) {
		return studentRepository.findById(parseLong);
	}

	@Override
	public Student updateStu(Student stu) {
		return studentRepository.save(stu);
	}

	@Override
	public String deleteStu(long parseLong) {
		studentRepository.deleteById(parseLong);
		return "Deleted employee with ID :" + parseLong;
	}

}
