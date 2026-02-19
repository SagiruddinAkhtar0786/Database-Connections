package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sql_Practice";
        String username = "root";
        String password = "123456";

        try {
            // 1. Load Driver (Optional in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected Successfully!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // 5. Process Result
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " "
                        + rs.getString("name"));
            }

            // 6. Close Connection
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
