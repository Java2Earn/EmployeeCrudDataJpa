package com.pdw.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pdw.dao.EmployeeDao;
import com.pdw.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;
	@Override
	public String createEmployee(Employee emp) {
		empDao.save(emp);
		/*Optional<Employee> emp1=findEmployee(emp.getEid());
		Employee emp2=emp1.get();*/
		return "Employee Registered with !!! .." ;
	}

	@Override
	public Optional<Employee> findEmployee(Integer empId) {

		return empDao.findById(empId);
	}

	@Override
	public List<Employee> findAllEmployees() {
	List<Employee> emps=	empDao.findAll();
	
		return emps;
	}

	@Override
	public List<Employee> findEmpByName(String empName) {

		return empDao.findByEname(empName);
	}

	@Override
	public String updateEmployee(Employee emp) {
		boolean result=empDao.existsById(emp.getEid());
		if(result)
		{
			empDao.save(emp);
			return "Updated Successfully";
		}else
		{
			empDao.save(emp);
			return "Inserted Successfully";
		}
		
	}
//3000 to 5000--->
	@Override
	public String deleteEmpById(Integer eId) {
		boolean result=empDao.existsById(eId);
		if(result)
		{
			empDao.deleteById(eId);
			return "Deleted Successfully";
		}else
		{
			return "Id Not Found !!!";
		}
	}

}
