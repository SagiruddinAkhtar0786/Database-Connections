package com.database.configuration.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.configuration.userDTO.AuthRequest;
import com.database.configuration.util.JWTUtil;


@RestController
public class AuthController {

	 @Autowired
	 private AuthenticationManager authenticationManager;
	 
	 @Autowired
	 private JWTUtil jwtUtil;
	@PostMapping("/Authenticate")
	public ResponseEntity<String> generateToken(@RequestBody AuthRequest authRequest){
		 try {
			 System.out.println("USERNAME = " + authRequest.getUsername());
			 System.out.println("PASSWORD = " + authRequest.getPassword());
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

	            String jwtToken = jwtUtil.generateToken(authRequest.getUsername());
	          //  return jwtUtil.generateToken(authRequest.getUserName());
	            return new ResponseEntity<>(jwtToken,HttpStatus.CREATED);

	        }catch (Exception e){
	            throw e;
	        }
	}
}
