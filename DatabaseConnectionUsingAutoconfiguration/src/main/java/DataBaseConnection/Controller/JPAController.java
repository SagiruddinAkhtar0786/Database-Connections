package DataBaseConnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import DataBaseConnection.Entity.User;
import DataBaseConnection.Service.UserService;

@RestController
public class JPAController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getData")
	public ResponseEntity<List<User>> fetchData(){
		
			List<User> users = userService.fetchDetails();
		
		
		return new ResponseEntity<>(users,HttpStatus.FOUND);
	}
	
	@PostMapping("/CreateUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		User singleuser = userService.createUser(user);
		return new ResponseEntity<>(singleuser,HttpStatus.CREATED);
	}
}
