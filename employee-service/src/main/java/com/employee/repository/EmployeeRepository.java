package com.employee.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;

import com.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findByEmpId(Long empId);

	@Query(value = "SELECT emp_id ,emp_name,email,department_id,img_url FROM dev.employee WHERE department_id =?", nativeQuery = true)
	List<Employee> getAllEmpByDeptId(Long deptId);

	@Modifying
	@Transactional
	@Query(value = "UPDATE dev.employee SET img_url =? WHERE emp_id=?", nativeQuery = true)
	void updateUrl(String url,Long id);

}
