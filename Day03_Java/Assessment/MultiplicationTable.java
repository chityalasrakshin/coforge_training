package com.coforge.Day3;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
//		4. Multiplication Table
//		Input a number.
//		Print its multiplication table up to 10.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter table number: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		sc.close();

	}

}
