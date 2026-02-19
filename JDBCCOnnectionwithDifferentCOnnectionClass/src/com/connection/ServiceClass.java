package com.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServiceClass {

	public void getEmployeeDetails() {

		try (Connection con = DBUtil.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from employee")) {
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
