package com.exam.Dbutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtility {
	
	private static Connection con;
	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit_db?user=root&password=root");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	public boolean testdb() {
		if(con!=null) {
			return true;
		}
		else {
		return false;
		}
	}


	public int update(PreparedStatement ps) {
		// TODO Auto-generated method stub
		return 0;
	}


	public PreparedStatement Create(String sql) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultSet query(PreparedStatement ps) {
		// TODO Auto-generated method stub
		return null;
	}
}
