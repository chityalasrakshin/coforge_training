package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdate {

	public static void main(String[] args) throws Exception {
		System.out.println("=== JDBC Update Demo ===");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");

		String updateEmployeeSql = "update tbl_emp set eid = ? where eid = ? ";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(updateEmployeeSql);
		
		preparedStatement.setInt(1, 110);
		preparedStatement.setInt(2, 102);

		
		int rowsAffected = preparedStatement.executeUpdate();
		
		if (rowsAffected == 1) {
			System.out.println("Employee record updated successfully.");
		} else {
			System.out.println("Employee record was not updated.");
		}
		
		preparedStatement.close();
		databaseConnection.close();
	}

}
