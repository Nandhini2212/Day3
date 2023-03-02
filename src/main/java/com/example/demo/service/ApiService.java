package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.respositories.EmployeeRepo;
import java.util.*;
@Service
public class ApiService {
@Autowired
EmployeeRepo repository;
public Optional<Employee> getemployee(int id){
	return repository.findById(id);
}

}
