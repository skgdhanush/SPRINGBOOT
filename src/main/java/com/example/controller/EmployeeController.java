package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.serviceImpl.EmpDetailsImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmpDetailsImpl empDetailsImpl;
	@GetMapping(value="/employeeDetails")
	public Employee getEmpDetails() {
		Employee employee = empDetailsImpl.employeeDetails();
			return employee;
	}
	
}
