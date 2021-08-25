package com.olive.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
