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
		//Your Code → JdbcTemplate → DataSource → MySQL Driver → MySQL DB = need both
	/*u need both because:

spring-boot-starter-jdbc → provides JDBC + DataSource + Spring support

mysql-connector-j → provides actual MySQL driver to connect DB

👉 Spring Boot gives DataSource, but NOT database driver*/
	@Autowired
	private EmployeeService empService;
	@GetMapping("/getData")
	public ResponseEntity<List<Employee>> getAllEmployeeDetails(){
		List<Employee> empList = empService.getAllEmployee();
		return new ResponseEntity(empList , HttpStatus.FOUND); //
	}
}
