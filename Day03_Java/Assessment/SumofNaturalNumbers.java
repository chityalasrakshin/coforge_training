package com.coforge.Day3;

import java.util.Scanner;

public class SumofNaturalNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println((num * (num + 1)) / 2);
		sc.close();
	}

}