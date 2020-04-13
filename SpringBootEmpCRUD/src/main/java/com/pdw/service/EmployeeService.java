package com.pdw.service;

import java.util.List;
import java.util.Optional;

import com.pdw.entity.Employee;

public interface EmployeeService {
	String createEmployee(Employee emp);
	Optional<Employee> findEmployee(Integer empId);
	List<Employee> findAllEmployees();
	List<Employee> findEmpByName(String empName);
	String updateEmployee(Employee emp);
	String deleteEmpById(Integer empId);
}
