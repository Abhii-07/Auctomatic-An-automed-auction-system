package com.auctomatic.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
	
	public static Connection provideConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");
		
		return DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		
	}
	
	public static void closeConnection(Connection con) throws ClassNotFoundException, SQLException {
		con.close();
	}
	
	
	public static boolean isResultSetEmpty(ResultSet rs) throws SQLException {
		if(!rs.isBeforeFirst() && rs.getRow() == 0) 
			return true;
		return false;
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn = DBUtils.provideConnection();
		System.out.println("Hi");
		closeConnection(conn);
		System.out.println("bye");
	}
}
