package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {
	public int createEmployee(Employee employee) throws SQLException,ClassNotFoundException {
		int rowsAffected = 0;
		Connection databaseConnection = DBUtil.getDBConnection();
		
		String insertEmployeeSql = "insert into tbl_emp values (?, ?, ?, ?)";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(insertEmployeeSql);
		preparedStatement.setInt(1, employee.getEmployeeId());
		preparedStatement.setString(2, employee.getEmployeeName());
		preparedStatement.setInt(3, employee.getEmployeeSalary());
		preparedStatement.setInt(4, employee.getDepartmentNumber());

		rowsAffected = preparedStatement.executeUpdate();
		
		return rowsAffected;
	}
	
	public int updateEmployee(Employee employee) throws SQLException, ClassNotFoundException {

		int rowsAffected = 0;
		Connection databaseConnection = DBUtil.getDBConnection();

		String updateEmployeeSql = "update tbl_emp set ename=?, esalary=?, dno=? where eid=?";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(updateEmployeeSql);

		preparedStatement.setString(1, employee.getEmployeeName());
		preparedStatement.setInt(2, employee.getEmployeeSalary());
		preparedStatement.setInt(3, employee.getDepartmentNumber());
		preparedStatement.setInt(4, employee.getEmployeeId());

		rowsAffected = preparedStatement.executeUpdate();

		return rowsAffected;
	}
	
	public int deleteEmployee(int employeeId) throws SQLException, ClassNotFoundException {

		int rowsAffected = 0;
		Connection databaseConnection = DBUtil.getDBConnection();

		String deleteEmployeeSql = "delete from tbl_emp where eid=?";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(deleteEmployeeSql);

		preparedStatement.setInt(1, employeeId);

		rowsAffected = preparedStatement.executeUpdate();

		return rowsAffected;
	}
	
	public Employee findEmployee(int employeeId) throws SQLException, ClassNotFoundException {

		Employee employeeRecord = null;

		Connection databaseConnection = DBUtil.getDBConnection();

		String findEmployeeSql = "select * from tbl_emp where eid=?";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(findEmployeeSql);

		preparedStatement.setInt(1, employeeId);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {

			employeeRecord = new Employee(
					resultSet.getInt("eid"),
					resultSet.getString("ename"),
					resultSet.getInt("esalary"),
					resultSet.getInt("dno"));
		}

		return employeeRecord;
	}
	
	public List<Employee> findAllEmployees() throws SQLException, ClassNotFoundException {

		List<Employee> employeeRecords = new ArrayList<>();

		Connection databaseConnection = DBUtil.getDBConnection();

		String findAllEmployeesSql = "select * from tbl_emp";
		PreparedStatement preparedStatement = databaseConnection.prepareStatement(findAllEmployeesSql);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			Employee employeeRecord = new Employee(
					resultSet.getInt("eid"),
					resultSet.getString("ename"),
					resultSet.getInt("esalary"),
					resultSet.getInt("dno"));

			employeeRecords.add(employeeRecord);
		}

		return employeeRecords;
	}


}
