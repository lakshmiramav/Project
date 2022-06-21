package com.rama.sampleproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@Entity
@Table(name="course")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseName;
   /*@ManyToMany(mappedBy = "courses")
    private List<Student> students;
    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Book> books; */
}


