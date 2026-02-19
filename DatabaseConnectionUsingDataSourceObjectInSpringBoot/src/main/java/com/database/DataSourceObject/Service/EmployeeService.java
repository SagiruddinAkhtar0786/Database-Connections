package com.database.DataSourceObject.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.DataSourceObject.entity.Employee;


@Service
public class EmployeeService {

	@Autowired
	private DataSource dataSource;

	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		try (Connection con = dataSource.getConnection();
				Statement st = con.createStatement();

				ResultSet rs = st.executeQuery("select * from employee");) {

			
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getString("salary"));
				emp.setDEPT(rs.getString("DEPT"));

				list.add(emp);
			}

		} catch (SQLException ex) {

			ex.printStackTrace();
		}
		
		return list;

	}

}
