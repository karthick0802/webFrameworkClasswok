package com.example.ques4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques4.model.address;

@RestController
public class Q4Controller {
    @GetMapping("/address")
      public Object add()
      {
        address addres=new address();
        addres.setDno(123);
        addres.setStname("Main Street");
        return addres;
      
  }
}

