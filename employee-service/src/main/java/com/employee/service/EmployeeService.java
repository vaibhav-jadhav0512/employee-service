package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmpDeptDto;
import com.employee.entity.Employee;
import com.employee.proxy.DepartServiceProxy;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Autowired
	private DepartServiceProxy proxy;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public EmpDeptDto getEmpWithDept(Long empId) {
		EmpDeptDto dto = new EmpDeptDto();
		dto.setEmployee(repository.findByEmpId(empId));
		dto.setDepartment(proxy.getDepartmentById(empId));
		return dto;
	}

	public List<Employee> getAllEmpByDeptId(Long deptId) {
		return repository.getAllEmpByDeptId(deptId);
	}

	public Employee getEmpById(Long empId) {
		return repository.findByEmpId(empId);
	}

	public Employee updateEmployee(Employee department, Long id) {
		return repository.save(department);
	}

	public void deleteEmployee(Long id) {
		repository.deleteById(id);
	}

	public void updateUrl(Long id, String url) {
		 repository.updateUrl(url,id);
	}

}
