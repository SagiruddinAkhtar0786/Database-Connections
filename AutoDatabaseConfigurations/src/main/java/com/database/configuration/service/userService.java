package com.database.configuration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.configuration.Repository.UserDetailsRepository;
import com.database.configuration.userDTO.UserResponseDto;

@Service
public class userService {
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public List<UserResponseDto> fetchData() {
		// TODO Auto-generated method stub
		return userDetailsRepository.findAll()
				.stream()
				.map( u -> new UserResponseDto(u.getUsername(),u.getRole()))
				.toList();

	}
	
	
	
	
	
}
