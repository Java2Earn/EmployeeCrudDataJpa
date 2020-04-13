package com.pdw.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdw.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> findByEname(String empName); 
}

