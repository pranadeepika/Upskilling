package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.model.StudentList;
import com.service.StudentService;





@CrossOrigin(origins ="http://localhost:4200" )
@RestController
//@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/addStu")
	public Student addEmployee(@RequestBody Student stu) {
		return this.studentService.addStu(stu);
	}

	@GetMapping("/getAllStu")
	public StudentList getAllStudent() {
		StudentList list = new StudentList();
		list.setAllStu(this.studentService.getAllStu());
		return list;
	}

	@GetMapping("/getByStu/{id}")
	public Optional<Student> getStudent(@PathVariable("id") String id) {
		return this.studentService.getStu(Long.parseLong(id));
	}

	@PutMapping("/updateStu")
	public Student updateStudent(@RequestBody Student stu) {
		return this.studentService.updateStu(stu);
	}

	@DeleteMapping("/deleteByStu/{id}")
	public String deleteStudent(@PathVariable("id") String id) {
		return this.studentService.deleteStu(Long.parseLong(id));
	}

}