package com.learn.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.learn.batch.entity.Student;

public class StudentProcessor implements ItemProcessor<Student, Student> {

	@Override
	public Student process(Student student) throws Exception {
		// TODO Auto-generated method stub
		return student;
	}

}
