package com.coforge.Day3;

import java.util.Scanner;

public class PrimeNumberCheck {
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if (isPrime(num)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		sc.close();
	}

}
