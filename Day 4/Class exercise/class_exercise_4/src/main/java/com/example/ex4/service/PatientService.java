package com.example.ex4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ex4.model.Patient;
import com.example.ex4.repository.PatientRepository;

import java.util.*;


@Service
public class PatientService {
    
    @Autowired
    public PatientRepository patientRepo;

    public Patient saveJob(@RequestBody Patient patient)
    {
        return patientRepo.save(patient);
    }

    public List<Patient> getAllPatient()
    {
       return patientRepo.findAll();
    }

    public Patient gPatient(int id)
    {
        return patientRepo.findById(id).orElse(null);
    }
}