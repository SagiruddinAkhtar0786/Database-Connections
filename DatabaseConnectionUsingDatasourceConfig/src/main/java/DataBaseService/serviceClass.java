package DataBaseService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceClass {

	@Autowired
	private DataSource datasource;

	public void connectAndQuerryDatabase() {
		
		System.out.println("entry 1");
		try (Connection con = datasource.getConnection();
				Statement st = con.createStatement();
				// String sql = ;
				ResultSet rs = st.executeQuery("Select * from EMPLOYEE")) {
			while (rs.next()) {
				System.out.println("Employee :: " + rs.getInt("id") + " - " + rs.getString("EmployeeeName") + " - "
						+ rs.getString("Email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
