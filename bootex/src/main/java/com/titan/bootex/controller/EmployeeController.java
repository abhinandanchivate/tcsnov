package com.titan.bootex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.titan.bootex.model.Employee;

//cors
@CrossOrigin(origins = "http://localhost:4200")
@RestController
// 4.0 
// @ResponseBody + @controller ===> RestController

// REST 
@RequestMapping("/api/v1")
public class EmployeeController {

	// return an employee object
	// header spec for providing employee details.
	// (need to return an GET URL to see complete info.
	// if record is existing then it should not allow to insert the details
	// it should return the error response
	// it should validate the data as per the validation rules which we have set it.
	
	// it should return the details in terms of JSON.===> do we need to do any provision?   ===> no ====> from spring 4.x version
	
	// reason is ===> in spring 4.x it will take  the JACKSON API to transform the java object to JSON implicitly.
	
	
	// when i will hit the end point ===> /api/v1/addEmployee with post method  ====>  we will set the data interms of json object ?
	// it has to transformed in terms of java object
	// 
	@PostMapping(path  = "addEmployee",produces = "application/json",consumes = "application/json")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;
	}
	
}

