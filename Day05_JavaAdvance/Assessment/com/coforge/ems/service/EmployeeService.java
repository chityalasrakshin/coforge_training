package com.coforge.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.dao.EmployeeDAO;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {
	private final EmployeeDAO employeeDao = new EmployeeDAO();

	public int createEmployee(Employee employee)
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int rowsAffected = 0;
		if (employee != null && employee.getEmployeeId() > 0 && employee.getEmployeeName() != null
				&& employee.getEmployeeSalary() > 0 && employee.getDepartmentNumber() > 0) {
			rowsAffected = employeeDao.createEmployee(employee);
		} else {
			throw new InvalidEmployeeObjectException();
		}
		return rowsAffected;
	}

	public int updateEmployee(Employee employee)
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {

		int rowsAffected = 0;

		if (employee != null && employee.getEmployeeId() > 0 && employee.getEmployeeName() != null
				&& employee.getEmployeeSalary() > 0 && employee.getDepartmentNumber() > 0) {

			rowsAffected = employeeDao.updateEmployee(employee);

		} else {

			throw new InvalidEmployeeObjectException();

		}

		return rowsAffected;
	}
	
	public int deleteEmployee(int employeeId)
			throws ClassNotFoundException, SQLException {

		return employeeDao.deleteEmployee(employeeId);
	}
	
	public Employee findEmployee(int employeeId)
			throws ClassNotFoundException, SQLException {

		return employeeDao.findEmployee(employeeId);
	}
	
	public List<Employee> findAllEmployees()
			throws ClassNotFoundException, SQLException {

		return employeeDao.findAllEmployees();
	}
}
