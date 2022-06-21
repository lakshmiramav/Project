package com.rama.sampleproject.repository;

import com.rama.sampleproject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
   // Course findByCourseName(String name);
}
    
