package com.mindtree.EmployeeManagement.service;



import java.util.List;

import com.mindtree.EmployeeManagement.entity.Employee;
/**
 * @author m1053638
 *
 */
public interface EmployeeService {

	
	
	String addEmployeeToDb(Employee employee) ;

	List<Employee> getAllEmployeeFromDb();

	Employee fetchEmployeeById(int id);

	String deleteEmployeeById(int id);

}
