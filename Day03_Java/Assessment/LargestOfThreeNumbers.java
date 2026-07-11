package com.coforge.Day3;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number1: ");
		int a = sc.nextInt();
		System.out.print("Enter the Number2: ");
		int b = sc.nextInt();
		System.out.print("Enter the Number3: ");
		int c = sc.nextInt();
		if (a > b & a > c) {
			System.out.println(a + " is Greatest");
		} else if (b > a & b > c) {
			System.out.println(b + " is Greatest");
		} else {
			System.out.println(c + " is Greatest");
		}
		sc.close();
	}

}
