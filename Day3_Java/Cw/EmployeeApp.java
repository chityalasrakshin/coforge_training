package com.coforge.Day3;

public class EmployeeApp {
	public static void main(String args[]) {
		Employee srakshin = new Employee(101, "Srakshin", 15000.0);
		srakshin.display();

		srakshin.setSalary(30000.0);
		srakshin.display();
		
		Employee varshith = new Employee(102, "Varshith", 10000.0);
		varshith.display();
	}

}
