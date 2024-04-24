package com.example.ex1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex1.model.Medicine;
import com.example.ex1.service.MedicineService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class MedicineController {
    
    @Autowired
    public MedicineService medicineService;

    
    @GetMapping("/medicines")
    public List<Medicine> getMethodName() {
        return medicineService.getMedicines();
    }

    @GetMapping("/medicine/{id}")
    public Medicine getMethodName(@PathVariable int id) {
        return medicineService.getMedicine(id);
    }

    @PostMapping("/post")
    public Medicine getMethodName(@RequestBody Medicine medicine)
    {
        return medicineService.saveMedicine(medicine);
    }

    @PutMapping("/medicine/{id}")
    public String getMethodName(@PathVariable int id,@RequestBody Medicine updateMedicine)
    {
        Medicine existingMedicine = medicineService.getMedicine(id);
        if(existingMedicine!=null)
        {
            existingMedicine.setMedicinePrice( updateMedicine.getMedicinePrice());
            medicineService.saveMedicine(existingMedicine);
        }
        else
        {
            return "No Data Found";
        }

        return "Updated";
    }

    @DeleteMapping("/medicine/{id}")
    public String delMethodName(@PathVariable int id)
    {
        Medicine existingMedicine = medicineService.getMedicine(id);
        if(existingMedicine!=null)
        {
            medicineService.deleteMedicine(id);
        }
        else
        {
            return "No Data Found";
        }
        return "Deleted";
    }
}