package com.example.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex2.model.Job;
import com.example.ex2.repository.JobRepo;

@Service
public class JobService {
    
    @Autowired
    private JobRepo jobRepo;

    public Job create(Job job)
    {
        return jobRepo.save(job);
    }
    public List<Job> get()
    {
        return jobRepo.findAll();
    }
    public Job get2(int id)
    {
        return jobRepo.findById(id).orElse(null);
    }
}
