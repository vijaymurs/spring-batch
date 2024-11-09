package com.learn.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.batch.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
