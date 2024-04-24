package com.example.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ex3.model.Village;
import com.example.ex3.repository.VillageRepo;

@Service
public class VillageService {
    @Autowired
    private VillageRepo rep;

    public Village post(@RequestBody Village person)
    {
        return rep.save(person);
    }

    public Village start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public Village get3(int id)
    {
        return rep.findById(id);
    }

    public List<Village> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
