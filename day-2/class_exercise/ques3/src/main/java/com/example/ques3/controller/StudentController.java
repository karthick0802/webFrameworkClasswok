package com.example.ques3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ques3.model.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
    @GetMapping("/student")
    public Object getMethodName() {
        Student student=new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setDesc("This is a student description");
        return student;
    }
    
}
