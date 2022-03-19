package com.crudproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection dbConnection()   {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cruddb", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return connection;
	}

}
