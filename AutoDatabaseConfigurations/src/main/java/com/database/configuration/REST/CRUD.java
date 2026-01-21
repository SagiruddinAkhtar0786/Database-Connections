package com.database.configuration.REST;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.configuration.userDTO.UserDto;

@RestController
public class CRUD {

	@Autowired
	private DataSource datasource;
	
	List<UserDto> users = new ArrayList<>();
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> fetchData() {
		try(Connection con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement("select id,name FROM user");
			ResultSet rs = ps.executeQuery()
		){
			 System.out.println("✅ DB is connected");
			while(rs.next()) {
				users.add(new UserDto(
						rs.getInt("id"),
						rs.getString("name")
						));
			}
			
		}catch(Exception e) {			
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(users);
		
	}
}
