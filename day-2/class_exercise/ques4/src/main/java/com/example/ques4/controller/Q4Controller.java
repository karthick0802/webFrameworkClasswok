package com.example.ques4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ques4.model.Book;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Q4Controller {
    @GetMapping("/book")
    public Object getObject()
     {
        Book book=new Book();
        book.setTitle("The Great Soldier");
        book.setAuthor("G.Gyan");
        LocalDate date=LocalDate.now();
        book.setPubdate(date);
        return book;
}

    
}
