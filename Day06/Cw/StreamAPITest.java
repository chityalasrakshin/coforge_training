package com.coforge.day6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StreamAPITest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15);

		// Note: count() returns how many elements match the filter.
		long evenNumberCount = numbers.stream().filter(number -> number % 2 == 0).count();

		System.out.println(evenNumberCount);
		
		System.out.println("--------------------");

		// Note: filter() keeps only the elements that match the condition.
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
		
		System.out.println("--------------------");
		
		// Note: map() transforms each filtered value.
		numbers.stream()
				.filter(number -> number % 2 == 0)
				.map(number -> number * 2)
				.forEach(System.out::println);
		
		System.out.println("--------------------");
		
		List<String> names = Arrays.asList("Abhi" , "Ram" , "Ramesh" , "Suresh");
		
		// Note: stream operations can be chained on strings as well.
		names.stream()
				.filter(name -> name.contains("a"))
				.map(name -> name.length())
				.forEach(System.out::println);
		
		System.out.println("--------------------");
		
		// Note: Date is the older Java date-time API.
		Date legacyDate = new Date();
		System.out.println(legacyDate);
		
		System.out.println("--------------------");
		
		// Note: LocalDate stores only the date part.
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		System.out.println("--------------------");
		
		// Note: LocalTime stores only the time part.
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		System.out.println("--------------------");

	}
}
