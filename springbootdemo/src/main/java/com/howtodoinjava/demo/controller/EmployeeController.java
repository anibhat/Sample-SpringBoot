package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Anirudh","Bhat","anirudh.p@mphasis.com"));
		return employeesList;
    }
	
		@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
    public List<Employee> addEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Anirudh","Bhat","anirudh.p@mphasis.com"));
		return employeesList;
    }

}
