package com.example.ques2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Q2Controller {
    @GetMapping("/studentName")
    public String getMethodName(@RequestParam String studentName) {
        return "Welcome "+studentName+"!";
    }
    
}
