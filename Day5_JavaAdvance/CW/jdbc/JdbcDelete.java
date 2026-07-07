package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDelete {

	public static void main(String[] args) throws Exception {
		System.out.println("=== JDBC Delete Demo ===");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");

		String deleteEmployeeSql = "delete from tbl_emp where eid = ? ";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(deleteEmployeeSql);
		
		preparedStatement.setInt(1, 101);
		
		int rowsAffected = preparedStatement.executeUpdate();
		
		if (rowsAffected == 1) {
			System.out.println("Employee record deleted successfully.");
		} else {
			System.out.println("Employee record was not deleted.");
		}
		
		preparedStatement.close();
		databaseConnection.close();
	}

}
