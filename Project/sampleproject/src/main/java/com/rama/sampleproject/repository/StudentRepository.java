package com.rama.sampleproject.repository;

import com.rama.sampleproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Integer> {
    Student findByStudentName(String name);
    
}
