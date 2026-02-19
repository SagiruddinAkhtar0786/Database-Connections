package com.database.DataSourceObject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.database.DataSourceObject.Service.EmployeeService;
import com.database.DataSourceObject.entity.Employee;

@Controller
public class EmployeeController {
		
	@Autowired
	private EmployeeService empService;
	@GetMapping("/getData")
	public ResponseEntity<List<Employee>> getAllEmployeeDetails(){
		List<Employee> empList = empService.getAllEmployee();
		return new ResponseEntity(empList , HttpStatus.FOUND);
	}
}
