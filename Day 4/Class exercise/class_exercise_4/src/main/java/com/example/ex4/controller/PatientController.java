package com.example.ex4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex4.model.Patient;
import com.example.ex4.service.PatientService;


@RestController
@RequestMapping("/api")
public class PatientController {
    
    @Autowired
    public PatientService patientService;

    @PostMapping("/patient")
    public Patient getMy(@RequestBody Patient patient)
    {
         return patientService.saveJob(patient);
    }

    @GetMapping("/patient")
    public List<Patient> getAllPatients()
    {
        return patientService.getAllPatient();
    }

    @GetMapping("/patient/{patientId}")
    public Patient getPatientid(@PathVariable("patientId") int a)
    {
        return patientService.gPatient(a);
    }
}
