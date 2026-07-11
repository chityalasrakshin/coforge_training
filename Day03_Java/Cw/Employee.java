package com.coforge.Day3;

//Java Bean or POJO or Model
public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	
	public Employee(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public void setSalary(double esalary) {
		this.esalary = esalary;
	}
	
	public double getSalary() {
		return esalary;
	}
	public void display() {
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
	
}
