package com.coforge.ems.controller;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

public class EmployeeController {
	private final EmployeeService employeeService = new EmployeeService();
	
	public String createEmployee(Employee employee) {
		String responseMessage = "";
		
		try {
			int rowsAffected = employeeService.createEmployee(employee);
			if (rowsAffected == 1) {
				responseMessage = "SUCCESS : Employee Record Inserted";
			}
		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
			responseMessage = "FAILED : " + exception.getMessage();
		} catch (SQLException exception) {
			exception.printStackTrace();
			responseMessage = "FAILED : " + exception.getMessage();
		} catch (InvalidEmployeeObjectException exception) {
			responseMessage = "FAILED : " + exception;
		}
		
		return responseMessage;
	}
	
	public String updateEmployee(Employee employee) {
		String responseMessage = "";

		try {
			int rowsAffected = employeeService.updateEmployee(employee);
			if (rowsAffected == 1) {
				responseMessage = "SUCCESS : Employee Record Updated";
			} else {
				responseMessage = "FAILED : Employee Record Not Updated";
			}
		} catch (ClassNotFoundException exception) {
			responseMessage = "FAILED : DB Error";
		} catch (SQLException exception) {
			responseMessage = "FAILED : DB Error";
		} catch (InvalidEmployeeObjectException exception) {
			responseMessage = "FAILED : " + exception;
		}

		return responseMessage;
	}
	
	public String deleteEmployee(int employeeId) {
		String responseMessage = "";

		try {
			int rowsAffected = employeeService.deleteEmployee(employeeId);
			if (rowsAffected == 1) {
				responseMessage = "SUCCESS : Employee Record Deleted";
			} else {
				responseMessage = "FAILED : Employee Record Not Found";
			}
		} catch (ClassNotFoundException exception) {
			responseMessage = "FAILED : DB Error";
		} catch (SQLException exception) {
			responseMessage = "FAILED : DB Error";
		}

		return responseMessage;
	}
	
	public Employee findEmployee(int employeeId) {
		Employee employeeRecord = null;

		try {
			employeeRecord = employeeService.findEmployee(employeeId);
		} catch (ClassNotFoundException exception) {
			System.out.println("DB Error");
		} catch (SQLException exception) {
			System.out.println("DB Error");
		}

		return employeeRecord;
	}
	
	public List<Employee> findAllEmployees() {
		List<Employee> employeeRecords = null;

		try {
			employeeRecords = employeeService.findAllEmployees();
		} catch (ClassNotFoundException exception) {
			System.out.println("DB Error");
		} catch (SQLException exception) {
			System.out.println("DB Error");
		}

		return employeeRecords;
	}

}
