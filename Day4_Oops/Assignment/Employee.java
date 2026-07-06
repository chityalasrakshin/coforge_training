package com.coforge.day4_java.Assignment;

public class Employee {
    int id;
    String name;
    double monthlySalary;

    Employee(int id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

}
