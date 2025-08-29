package DataBaseConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import DataBaseService.serviceClass;

@SpringBootApplication
@ComponentScan(basePackages = {"DataBaseConnection", "DataBaseService" , "DataBaseConnection", "DataSource"})
public class DatabaseConnectionUsingDatasourceConfigApplication {

	

	public static void main(String[] args) {
		//SpringApplication.run(DatabaseConnectionUsingDatasourceConfigApplication.class, args);
		 // Start Spring Boot and get the application context
        ApplicationContext context = SpringApplication.run(DatabaseConnectionUsingDatasourceConfigApplication.class, args);

        // Get your service bean from the context
        serviceClass service = context.getBean(serviceClass.class);

        // Call your method directly
        service.connectAndQuerryDatabase();
	}
	
	

	
}
