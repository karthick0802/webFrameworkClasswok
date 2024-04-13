package com.example.ques2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ques2.model.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
    @GetMapping("/students")
    public Object getMethodName() {
        Student student=new Student();
        student.setName("Nikila");
        student.setAge(18);
        return student;
        
    }
    
}
