package com.example.ex1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex1.model.Product;
import com.example.ex1.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    public ProductRepo collegeRepository;

    public Product saveCollege(Product college)
    {
        return collegeRepository.save(college);
    }
    public Product getCollege(int id)
    {
        return collegeRepository.findById(id).orElse(null);
    }

    public void DeleteStudent(int a)
    {
        collegeRepository.deleteById(a);
    }
}
