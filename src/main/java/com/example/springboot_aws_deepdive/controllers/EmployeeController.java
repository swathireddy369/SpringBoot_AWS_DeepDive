package com.example.springboot_aws_deepdive.controllers;

import com.example.springboot_aws_deepdive.entities.Employee;
import com.example.springboot_aws_deepdive.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/save")
    public String saveEmployee(@RequestBody Employee employee) {
      return   employeeService.saveEmployee(employee);
    }
    @GetMapping("/get")
    public List<Employee> findEmployees() {
        return   employeeService.findAll();
    }
    @GetMapping("/get/{id}")
    public Employee findEmployeeById(@PathVariable Integer id) {
        return   employeeService.findById(id);
    }
}
