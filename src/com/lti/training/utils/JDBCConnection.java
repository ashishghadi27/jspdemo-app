package com.lti.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCConnection {
	
	public Connection getConnection(){
		
		Connection conn = null;
		
		try {
			Class.forName(Constants.DRIVER);
			conn = DriverManager.getConnection(Constants.DRIVER_ADDRESS, Constants.USERNAME, Constants.PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public  ResultSet runSelectQuery(String query, Connection conn){
		ResultSet resultSet = null;
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
}
