package com.example.ex3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex3.model.Product;
import com.example.ex3.repository.ProductRepository;

import java.util.*;


@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepo;

    public Product saveProduct(Product product)
    {
        return productRepo.save(product);
    }

    public List<Product> getList()
    {
        return productRepo.findAll();
    }

    public Product getProductid(int productId)
    {
        return productRepo.findById(productId).orElse(null);
    }
}