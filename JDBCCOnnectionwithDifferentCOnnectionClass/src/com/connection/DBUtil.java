package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_Practice","root","123456");
	}
	/*try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_Practice");
		Statement st =con.createStatement()
		
			)
	
	{
		
	}catch(SQLException ex) {
		ex.printStackTrace();
	}*/
}
