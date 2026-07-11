package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {

	public static void main(String[] args) throws Exception {
		System.out.println("=== JDBC Insert Demo ===");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");

		String insertEmployeeSql = "insert into tbl_emp values(?, ?, ?, ?) ";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(insertEmployeeSql);
		
		preparedStatement.setInt(1, 102);
		preparedStatement.setString(2, "pranav");
		preparedStatement.setInt(3, 60000);
		preparedStatement.setInt(4, 10);

		
		int rowsAffected = preparedStatement.executeUpdate();
		
		if (rowsAffected == 1) {
			System.out.println("Employee record inserted successfully.");
		} else {
			System.out.println("Employee record was not inserted.");
		}
		
		preparedStatement.close();
		databaseConnection.close();
	}

}
