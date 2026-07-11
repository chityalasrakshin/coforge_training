package com.coforge.Day3;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String args[]) {
//		3. Grade Calculator
//		Accept marks (0–100) and display:
//		A: 90–100
//		B: 80–89
//		C: 70–79	
//		D: 60–69
//		F: Below 60

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks: ");
		int marks = sc.nextInt();
		if (marks >= 90) {
			System.out.println("A");
		} else if (marks >= 80) {
			System.out.println("B");
		} else if (marks >= 70) {
			System.out.println("C");
		} else if (marks >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		sc.close();
	}

}
