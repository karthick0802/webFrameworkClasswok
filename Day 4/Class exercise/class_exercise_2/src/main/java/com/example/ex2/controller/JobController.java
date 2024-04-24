package com.example.ex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex2.model.Job;
import com.example.ex2.service.JobService;

@RestController
@RequestMapping("/api")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/job")
    public Job hel(@RequestBody Job job) {
        return jobService.create(job);
    }

    @GetMapping("/jobs")
    public List<Job> hel2() {
        return jobService.get();
    }

    @GetMapping("/job/{jobId}")
    public Job hel3(@PathVariable("jobId") int id) {
        return jobService.get2(id);
    }

}
