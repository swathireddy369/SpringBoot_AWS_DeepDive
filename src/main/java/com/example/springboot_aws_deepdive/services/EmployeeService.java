package com.example.springboot_aws_deepdive.services;

import com.example.springboot_aws_deepdive.entities.Employee;
import com.example.springboot_aws_deepdive.repositoires.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public String saveEmployee(Employee employee) {
        try{
            employeeRepository.save(employee);
            return "Employee saved successfully";
        }catch (Exception e){
            System.out.println("Employee could not be saved");
        }
        return "Employee could not be saved";
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Integer id) {
        Optional<Employee> employee= employeeRepository.findById(id);
        return employee.orElse(null);
    }
}
