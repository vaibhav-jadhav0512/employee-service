package com.employee.dto;

import com.employee.entity.Employee;

public class EmpDeptDto {

	private Employee employee;
	private Department department;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmpDeptDto [employee=" + employee + ", department=" + department + "]";
	}
}
