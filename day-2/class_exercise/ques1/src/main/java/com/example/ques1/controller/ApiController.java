package com.example.ques1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques1.config.AppConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @Autowired
    public AppConfig appConfig;
    @GetMapping("/info")
    public String getMethodName() {
        return "App Name: "+appConfig.getAppName()+",Version: "+appConfig.getAppVersion();
    }
    
}
