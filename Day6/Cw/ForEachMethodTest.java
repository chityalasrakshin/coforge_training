package com.coforge.day6;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodTest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 55, 65);
		
		// Note: basic lambda syntax with forEach.
		numbers.forEach(number -> System.out.println(number));
		
		System.out.println("--------------------");
		
		// Note: block lambda is useful when extra logic is needed.
		numbers.forEach(number -> {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		});
		
		System.out.println("--------------------");
		
		// Note: method reference is the short form of printing each element.
		numbers.forEach(System.out::println);

	}

}
