package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int EmpId;
	private String name;
	private String EmailId;
	private String dob;
	private String doj;
	private long PhoneNo;
	private String compName;
	private String compAddress;
	private String StreetName;
	private String DistName;
	private String StateName;
	private int PinCode;
}
