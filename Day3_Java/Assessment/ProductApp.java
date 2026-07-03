package com.coforge.Day3;

public class ProductApp {
	public static void main(String[] args) {
		Product p1 = new Product(201, "Wireless Mouse", 599.50, 3);
		p1.displayBill();

		System.out.println();

		Product p2 = new Product(202, "Keyboard", 1200.00, 2);
		p2.displayBill();
	}
}