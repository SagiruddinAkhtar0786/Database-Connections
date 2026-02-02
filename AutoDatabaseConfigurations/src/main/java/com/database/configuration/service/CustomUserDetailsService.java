package com.database.configuration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.database.configuration.Repository.UserDetailsRepository;
import com.database.configuration.userDTO.Users;

@Service   // ✅ THIS WAS MISSING
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Users user =  userDetailsRepository.findByUsername(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException("Username not found"));
        return user;
        
		/*
		 * return new org.springframework.security.core.userdetails.User(
		 * user.getUsername(), user.getPassword(), List.of(new
		 * SimpleGrantedAuthority(user.getRole())) );
		 */
    }

}
