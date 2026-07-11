package com.coforge.Day3;

public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book(101, "The Alchemist", "Paulo Coelho", 399.00);
		b1.display();

		System.out.println();

		Book b2 = new Book(102, "Atomic Habits", "James Clear", 599.50);
		b2.display();
	}
}