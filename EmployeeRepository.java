package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Employee;

public interface EmployeeRepository extends JpaRepository <Employee ,Long> {
	

}

