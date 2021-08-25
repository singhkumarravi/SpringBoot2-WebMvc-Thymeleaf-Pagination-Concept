package com.olive.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.olive.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmpById(Employee emp);
	
	public List<Employee> getAllEmp();
	
	public Page<Employee> getAllEmpByPage(Pageable pageable);
	
	
	

}
