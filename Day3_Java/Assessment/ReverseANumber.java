package com.coforge.Day3;

import java.util.Scanner;

public class ReverseANumber {
	static int reversenum(int n) {
		if (n < 10) {
			return n;
		}
		int rev = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}

		return rev;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = reversenum(num);
		System.out.println("Reversed Number is " + num);
		sc.close();
	}

}
