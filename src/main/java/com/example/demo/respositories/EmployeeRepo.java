package com.example.demo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Employee;
import com.example.demo.respositories.EmployeeRepo;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
