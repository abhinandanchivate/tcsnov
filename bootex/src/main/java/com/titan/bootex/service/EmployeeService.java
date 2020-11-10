package com.titan.bootex.service;

import java.util.List;

import com.sun.el.stream.Optional;
import com.titan.bootex.model.Employee;

public interface EmployeeService {

	
	public String addEmployee(Employee employee);
	public String updateEmployee(long id, Employee employee);
	public java.util.Optional<Employee> getEmployeeById(long id);
	public java.util.Optional<List<Employee>> getEmployees();
	
}
