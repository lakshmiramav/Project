package com.rama.sampleproject.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="student")
@Data                                                                                               
@AllArgsConstructor                
@NoArgsConstructor   
public class Student 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;                                    
    private String studentName;
    private String studentGender;  
    private String studentEmail;   

	@ManyToMany
	@JoinTable(name = "student_course")
	private List<Course> courses;
    
}