package com.employee.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.dto.Department;

@FeignClient(name = "DEPARTMENT-SERVICE", url = "localhost:9001")
public interface DepartServiceProxy {

	@GetMapping("/departments/get/{id}")
	public Department getDepartmentById(@PathVariable Long id);
}
