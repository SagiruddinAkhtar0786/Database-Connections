package com.database.configuration.Test;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigurationDatabaseConnection {
	
	@Bean
	CommandLineRunner testDB(DataSource datasource) {
		return args ->{
			System.out.println("Db Connected");
		};
	}
}
