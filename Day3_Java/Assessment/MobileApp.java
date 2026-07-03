package com.coforge.Day3;

public class MobileApp {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "Galaxy S24", 8, 74999.00);
		System.out.println(m1);

		m1.setPrice(69999.00);
		m1.setRam(12);
		System.out.println(m1);
	}
}