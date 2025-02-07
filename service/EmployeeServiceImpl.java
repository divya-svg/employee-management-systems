package com.example.demo.service;

import org.hibernate.FetchNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private static final Exception id = null;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public Iterable<Employee> findEmployees() {
		return employeeRepository.findAll();
		
	}

	@Override
	public Employee getEmployeeID(long id) {
      Employee employee = employeeRepository.findById(id)
    		  .orElseThrow(() -> new  FetchNotFoundException("Employee", id));
		return employee;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);		
	}

	


	}


