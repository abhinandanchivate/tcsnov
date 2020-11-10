package com.titan.bootex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titan.bootex.model.Employee;
import com.titan.bootex.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = employeeRepository.save(employee);
		
		if(employee2== null) {
			return "fail";
		}
		else {
			return "success";
		}
	}

	@Override
	public String updateEmployee(long id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(employeeRepository.findAll());
	}

}
