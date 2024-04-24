package com.example.ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex3.model.Product;
import com.example.ex3.service.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("/product")
    public Product getMyProduct(@RequestBody Product product)
    {
         return productService.saveProduct(product);
    }

    @GetMapping("/product")
    public List<Product> getProducts()
    {
        return productService.getList();
    }

    @GetMapping("/product/{productId}")
    public Product getProductid(@PathVariable("productId") int a)
    {
        return productService.getProductid(a);
    }
}