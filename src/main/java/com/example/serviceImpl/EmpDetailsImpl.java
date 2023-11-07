package com.example.serviceImpl;

import com.example.service.EmpDetails;

import org.springframework.stereotype.Component;

import com.example.model.*;
@Component
public class EmpDetailsImpl implements EmpDetails {

	@Override
	public Employee employeeDetails() {
		Employee e = new Employee(123,"DhanushKumar","dhanushkumarg2020@gmail.com","07/05/2002","07/11/2023",6382757488l,"Cognizant","Thoraipakkam","ptc Quarters","chennai","TamilNadu",600097);
		return e;
	}

}
