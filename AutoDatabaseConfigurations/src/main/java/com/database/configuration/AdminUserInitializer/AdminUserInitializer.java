package com.database.configuration.AdminUserInitializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.database.configuration.Repository.UserDetailsRepository;
import com.database.configuration.userDTO.Users;

@Configuration
public class AdminUserInitializer {

    @Bean
    public CommandLineRunner createAdminUser(
            UserDetailsRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            if (userRepository.findByUsername("admin").isEmpty()) {

                Users admin = new Users();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin1234"));
                admin.setRole("ROLE_ADMIN");

                userRepository.save(admin);

                System.out.println("✅ Default admin user created");
            }
        };
    }
}

