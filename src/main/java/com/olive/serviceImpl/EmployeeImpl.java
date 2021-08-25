package com.olive.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.olive.model.Employee;
import com.olive.repo.EmployeeRepo;
import com.olive.service.EmployeeService;
@Service
public  class EmployeeImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Employee saveEmpById(Employee emp) {
		
		return repo.save(emp);
	}
	
	@Override
	public List<Employee> getAllEmp() {
		
		return repo.findAll();
	}

@Override
public Page<Employee> getAllEmpByPage(Pageable pageable) {

	return repo.findAll(pageable);
}

}
