package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcSelect {

	public static void main(String[] args) throws Exception {
		System.out.println("=== JDBC Select Demo ===");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root",
				"Pranav@2409");

		String selectEmployeesSql = "select * from tbl_emp ";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(selectEmployeesSql);
		
		ResultSet employeeResultSet = preparedStatement.executeQuery();
		System.out.println("Employee records:");
		
		while (employeeResultSet.next()) {
			System.out.print(employeeResultSet.getInt("eid") + "  " + employeeResultSet.getString("ename") + " "
					+ employeeResultSet.getInt("esalary") + " " + employeeResultSet.getInt("dno"));
			System.out.println();
		}

		employeeResultSet.close();
		preparedStatement.close();
		databaseConnection.close();
	}

}
