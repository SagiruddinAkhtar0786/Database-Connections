package DataSource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class dataSourceConfiguration {
	
	//DataSource dataSource;
	
	@Bean
	public DataSource getConnection() {
       // HikariDataSource dataSource = new HikariDataSource();
        HikariDataSource datasource = new HikariDataSource();
        datasource.setJdbcUrl("jdbc:mysql://localhost:3306/Practice");
        datasource.setUsername("root");
        datasource.setPassword("123456");
        datasource.setMaximumPoolSize(10);
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
	}

}
