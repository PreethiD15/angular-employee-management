package com.mindtree.EmployeeManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.EmployeeManagement.entity.Employee;
import com.mindtree.EmployeeManagement.repository.EmployeeRepository;
import com.mindtree.EmployeeManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public String addEmployeeToDb(Employee employee) {
		System.out.println(employee);
		employeeRepository.save(employee);
		return "Employee "+employee.getName()+" Added Successfully";
	}

	@Override
	public List<Employee> getAllEmployeeFromDb() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public String deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return "Employee Deleted Successfully";
	}

}
