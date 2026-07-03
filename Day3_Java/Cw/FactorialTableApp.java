package com.coforge.Day3;

import java.util.Scanner;

public class FactorialTableApp {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int n = sc.nextInt();
		int fact = 1;
		int i;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println(i + " Factorial is : " + fact);
		}
		sc.close();
	}

}
