package com.mindtree.EmployeeManagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.EmployeeManagement.entity.Employee;
import com.mindtree.EmployeeManagement.service.EmployeeService;
@RequestMapping("employee")
@RestController
@CrossOrigin(origins="*")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	//find all employee
	@GetMapping("allEmployee")
	public List<Employee> getAllEmployees() {
		List<Employee> employeelist = new ArrayList<>();
		employeelist = employeeService.getAllEmployeeFromDb();
		return employeelist;

	}
	//get all employee
	@RequestMapping("addEmployee")
	public String createEmployee(@RequestBody Employee employee)
	{
		System.out.println(employee);
		String message = employeeService.addEmployeeToDb(employee);
		return message;
	}
	@GetMapping("findEmployee/{empid}")
	public Employee getEmployeeById(@PathVariable("empid") int empid) {
		Employee employee = employeeService.fetchEmployeeById(empid);
		return employee;
	}
	
	 @DeleteMapping("deleteEmployee/{empid}")
	    public String deleteUser(@PathVariable("empid") int empid)  {
	           String message = employeeService.deleteEmployeeById(empid);
	           return message;
	 }
	        
	
}
