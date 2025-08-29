package connection.Database;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement st = null;
		
		try {
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice","root","123456");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root", "123456");

			st = con.createStatement();
			con.setAutoCommit(false);
			int rows = st.executeUpdate("INSERT INTO EMPLOYEE(id,EmployeeeName,Email) VALUES(1,'sagir','srakhtar1997@gmail.com')");
			System.out.println(rows +"rows inserted successfully!!");
			con.commit()
;		}catch(Exception e) {
			try {
				if(con != null)
					con.close();
				if(st != null)
					st.close();
			}catch(Exception ee1) {
				ee1.printStackTrace();
				}
			
			e.printStackTrace();
		}

	}

}
