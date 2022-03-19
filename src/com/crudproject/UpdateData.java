package com.crudproject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {

	public static void updateData(String name, int id) {
			try(
					
					Connection connection = DbConnection.dbConnection();
					PreparedStatement statement = connection.prepareStatement("update student set name='"+name+"' where id ='"+id+"'");
					
				) {
				int value = statement.executeUpdate();
				if(value>0) {
					System.out.println("update");
				}
				else {
					System.out.println("not update");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
