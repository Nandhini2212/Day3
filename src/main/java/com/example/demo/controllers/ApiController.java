package com.example.demo.controllers;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.respositories.EmployeeRepo;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
@Autowired
	EmployeeRepo serviceRepository;
@Autowired
ApiService service;
@GetMapping("/get")
List<Employee> getList(){
	return serviceRepository.findAll();
	
}
@GetMapping("/{id}")
public Optional<Employee> getbyid(@PathVariable int id){
	return service.getemployee(id);
}
@PostMapping("/")
public Employee postemp(@RequestBody Employee emp) {
	return serviceRepository.save(emp);
}

}
