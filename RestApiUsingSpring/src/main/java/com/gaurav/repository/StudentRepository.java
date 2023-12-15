package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
