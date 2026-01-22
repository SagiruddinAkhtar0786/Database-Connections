package DataBaseConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import DataBaseConnection.Service.UserService;

@SpringBootApplication
public class DatabaseConnectionUsingAutoconfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DatabaseConnectionUsingAutoconfigurationApplication.class, args);
		UserService service = context.getBean(UserService.class);
		service.fetchDetails();
	}

}
