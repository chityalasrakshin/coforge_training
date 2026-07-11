package com.coforge.Day3;

public class MovieApp {
	public static void main(String[] args) {
		Movie m1 = new Movie("Inception", "Christopher Nolan", 8.8);
		System.out.println(m1);

		m1.setRating(9.0);
		System.out.println(m1);

		m1.setRating(15);   
		System.out.println(m1);
	}
}