package com.olive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.olive.model.Employee;
import com.olive.service.EmployeeService;

@Controller
public class EmpController {
	
@Autowired
private EmployeeService service;
	
	@GetMapping("/")
	private String showReg(Model model) {
		model.addAttribute("emp",new Employee());
		return "register";
	}
	
	@PostMapping("/reg/save")
	private String saveData(@ModelAttribute Employee emp,Model model) {
		Employee emps = service.saveEmpById(emp);
		Integer id = emps.getEmpId();
		String msg="Employee Save With Id " +id;
		model.addAttribute("msg", msg);
		return "message";
	}
	
	@GetMapping("/show/all")
	public String showData(Model model) {
		   List<Employee> list = service.getAllEmp();
		   model.addAttribute("list",list);
		return "show";
	}
	
	@GetMapping("/show")
	public String showDataUsingPage(@PageableDefault(page=1,size=10)Pageable pageable,Model model) {
		               
		    Page<Employee> page = service.getAllEmpByPage(pageable);
		    
		   model.addAttribute("list",page.getContent());
		   model.addAttribute("page",page);
		   return "show";
	}
	
	
}
