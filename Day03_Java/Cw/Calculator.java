package com.coforge.Day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String confirmation;

		do {
			System.out.println("Enter first number:");
			int a = sc.nextInt();

			System.out.println("Enter second number:");
			int b = sc.nextInt();

			System.out.println("Choose operation:");
			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");

			int choice = sc.nextInt();
			int result = 0;
			boolean validOperation = true;

			switch (choice) {
				case 1:
					result = a + b;
					System.out.println("Result: " + result);
					break;
				case 2:
					result = a - b;
					System.out.println("Result: " + result);
					break;
				case 3:
					result = a * b;
					System.out.println("Result: " + result);
					break;
				case 4:
					if (b != 0) {
						result = a / b;
						System.out.println("Result: " + result);
					} else {
						System.out.println("Error: Division by zero is not allowed.");
						validOperation = false;
					}
					break;
				default:
					System.out.println("Error: Invalid choice.");
					validOperation = false;
			}

			System.out.println("Do you want to continue [Yes | No]?");
			confirmation = sc.next();

		} while (confirmation.equalsIgnoreCase("Yes"));

		sc.close();
		System.out.println("Calculator closed.");
	}
}