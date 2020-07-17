package db;

import java.sql.*;

public class DBtest {
	public static void main(String[] args) {
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		Connection con = null;
		try {
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","c##test","test");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
