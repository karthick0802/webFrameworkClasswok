package com.example.ex4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ex4.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository <Patient,Integer>{

    
}
