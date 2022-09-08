package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findByEmpId(Long empId);

	@Query(value = "SELECT emp_id ,emp_name,email,department_id FROM dev.employee WHERE department_id =?", nativeQuery = true)
	List<Employee> getAllEmpByDeptId(Long deptId);

}
