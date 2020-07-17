package db;

import java.sql.*;

public class DBtest3 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "c##test", "test");
			String sql = "insert into user_info(num ,name, etc)";
			sql += "values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);//앞에는 준비된 뒤는 준비하겠따
			ps.setInt(1, 1);
			ps.setString(2, "이름");
			ps.setString(3, "기본");
			ps.executeUpdate();
			sql = "update user_info set name=?, etc=? where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "테스트");
			ps.setString(2, "비고");
			ps.setInt(3, 1);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
