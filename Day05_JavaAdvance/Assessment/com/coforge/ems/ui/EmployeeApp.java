package com.coforge.ems.ui;

import java.util.List;
import java.util.Scanner;

import com.coforge.ems.controller.EmployeeController;
import com.coforge.ems.model.Employee;

public class EmployeeApp {

	private static final EmployeeController employeeController = new EmployeeController();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continueChoice = " ";
		String statusMessage = "";
		do {
			System.out.println("=== Employee Management System ===");
			System.out.println("1. Create 2. Update 3. Delete 4. Find 5. Find All 6. Quit");
			System.out.println("Enter your choice:");
			int menuChoice = scanner.nextInt();
			switch (menuChoice) {
			case 1:
				System.out.println("Enter employee ID, name, salary, and department number:");
				Employee employeeRecord = new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt(),
						scanner.nextInt());
				statusMessage = employeeController.createEmployee(employeeRecord);
				System.out.println(statusMessage);
				break;
			case 2:
				System.out.println("Enter employee ID, new name, new salary, and new department number:");
			    employeeRecord = new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt(),
			            scanner.nextInt());
			    statusMessage = employeeController.updateEmployee(employeeRecord);
			    System.out.println(statusMessage);
				break;
			case 3:
				System.out.println("Enter employee ID to delete:");
			    int employeeId = scanner.nextInt();
			    statusMessage = employeeController.deleteEmployee(employeeId);
			    System.out.println(statusMessage);
				break;
			case 4:
				System.out.println("Enter employee ID to find:");
			    employeeId = scanner.nextInt();

			    Employee employeeDetails = employeeController.findEmployee(employeeId);

			    if (employeeDetails != null)
			        System.out.println(employeeDetails);
			    else
			        System.out.println("Employee not found.");
				break;
			case 5:
				System.out.println("Employee details:");
				List<Employee> employeeRecords = employeeController.findAllEmployees();
				if (employeeRecords != null && !employeeRecords.isEmpty()) {
				    for (Employee employee : employeeRecords) {
				        System.out.println(employee);
				    }
				} else {
				    System.out.println("No employee records found.");
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}

			System.out.println("Do you want to continue {Yes | No}?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("Yes"));

	}

}
