package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmpDeptDto;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/get/emp/dept/{empId}")
	public EmpDeptDto getEmpWithDept(@PathVariable Long empId) {
		return service.getEmpWithDept(empId);
	}

	@GetMapping("/get/all/{deptId}")
	public List<Employee> getAllEmpByDeptId(@PathVariable Long deptId) {
		return service.getAllEmpByDeptId(deptId);
	}

	@GetMapping("/get/{empId}")
	public Employee getEmpById(@PathVariable Long empId) {
		return service.getEmpById(empId);
	}

	@PutMapping("/update/{id}")
	public Employee updateEmployee(@RequestBody Employee department, @PathVariable("id") Long id) {
		return service.updateEmployee(department, id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
	}
}
