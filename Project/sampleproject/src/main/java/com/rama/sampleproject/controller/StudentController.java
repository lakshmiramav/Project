package com.rama.sampleproject.controller;

import com.rama.sampleproject.entity.Student;
import com.rama.sampleproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

   @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
       return studentService.saveStudent(student);
   }
   @PostMapping("/addstudents")
   public List<Student> addStudents(@RequestBody List<Student> students){
       return studentService.saveStudents(students);
   }

   @PostMapping("/students")
   public List<Student> findAllStudent(){
       return studentService.getStudents();
   }

   @GetMapping("/studentbyname/{name}")
   public Student findByStudentName(@PathVariable String name){
       return studentService.getStudentByName(name);
   }

   @GetMapping("/studentbyid/{id}")
   public Student findStudentById(@PathVariable int id){
       return studentService.getStudentById(id);
   }
   @DeleteMapping("/delete/{id}")
   public  String deleteStudent(@PathVariable int id){
       return  studentService.deleteStudent(id);
   }
  @PutMapping("/update")
   public Student updateStudent(@RequestBody Student student){
       return studentService.updateStudents(student);
   }
}
