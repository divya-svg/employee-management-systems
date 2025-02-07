package com.example.demo.service;

import com.example.demo.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	Iterable<Employee> findEmployees();
	Employee getEmployeeID(long id);
	void deleteEmployee(Long id);
	
	

}
