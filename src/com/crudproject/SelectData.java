package com.crudproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

	public static void selectData() {
		try (Connection con = DbConnection.dbConnection();
				Statement statement = con.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from student");) {
			while(resultSet.next()) {
				System.out.print(resultSet.getInt(1));
				System.out.print(" , "+resultSet.getString(2));
				System.out.print(" , "+resultSet.getString(3));
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
