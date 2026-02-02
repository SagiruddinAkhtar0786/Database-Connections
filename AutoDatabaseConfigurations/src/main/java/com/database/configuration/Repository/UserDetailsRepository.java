package com.database.configuration.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.database.configuration.userDTO.Users;


@Repository
public interface UserDetailsRepository extends JpaRepository<Users,Long> {
	Optional<Users> findByUsername(String username); 
}
