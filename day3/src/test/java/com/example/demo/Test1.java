package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.model.Student;


public class Test1 {
	@Test
	void testStudentDetails() {
	        Student student = new Student();
	        student.setName("Deepika");
	        student.setAge(23);
	        student.setSalary(28000);
	 
	        assertEquals("Deepika", student.getName());
	        assertEquals(23, student.getAge());
	        assertEquals(28000.0, student.getSalary(), 0.001);
	    }
}
