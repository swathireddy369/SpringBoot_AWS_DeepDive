package com.example.springboot_aws_deepdive.repositoires;

import com.example.springboot_aws_deepdive.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
