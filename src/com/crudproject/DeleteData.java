package com.crudproject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {
	public static void deleteData(int id) {
		try(
			Connection connection = DbConnection.dbConnection();
			PreparedStatement statement = connection.prepareStatement("delete from test where id ='"+id+"'");
			
			) {
			int value = statement.executeUpdate();
			if(value>0) {
				System.out.println("delete successfull...");
			}
			else {
				System.out.println("don't delete....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
