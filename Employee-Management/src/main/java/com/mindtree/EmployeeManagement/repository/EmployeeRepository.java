package com.mindtree.EmployeeManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.EmployeeManagement.entity.Employee;
/**
 * @author m1053638
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer > {

}
