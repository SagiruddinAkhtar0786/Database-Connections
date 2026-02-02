package com.database.configuration.REST;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.configuration.service.userService;
import com.database.configuration.userDTO.AuthRequest;
import com.database.configuration.userDTO.UserDto;
import com.database.configuration.userDTO.UserResponseDto;
import com.database.configuration.userDTO.Users;

@RestController
public class CRUD {


	 
	@Autowired
	private userService UserService;
	@Autowired
	private DataSource datasource;
	
	List<UserDto> users = new ArrayList<>();
	
	
	
	
	
	@GetMapping("/getdta")
	public ResponseEntity<List<UserResponseDto>> fetchData(){
	//	List<UserDto> list = new ArrayList<>();
		List<UserResponseDto> lst = UserService.fetchData();
		
		System.out.println(lst);
		
		return new ResponseEntity<>(lst,HttpStatus.OK);
		
		//return ResponseEntity.ok(UserService.fetchData());
		
	}
	
	
	@GetMapping("/fetchData")
	public ResponseEntity<List<UserResponseDto>> fetchDataAll(){
	//	List<UserDto> list = new ArrayList<>();
		List<UserResponseDto> lst = UserService.fetchData();
		
		System.out.println(lst);
		
		return new ResponseEntity<>(lst,HttpStatus.OK);
		
		//return ResponseEntity.ok(UserService.fetchData());
		
	}
	
	/*@GetMapping("/users")
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
		
	}*/
	
	
}
