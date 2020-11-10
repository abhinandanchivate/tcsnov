package com.titan.bootex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.titan.bootex.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
