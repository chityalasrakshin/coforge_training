package com.coforge.day5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetTest {

	public static void main(String[] args) {
		Set<Integer> numbers = new LinkedHashSet<>();
		System.out.println("=== LinkedHashSet Demo ===");

		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(35);
		numbers.add(20);
		System.out.println("Initial set: " + numbers);
		System.out.println("Removed 30: " + numbers.remove(30));
		System.out.println("Updated set: " + numbers);

		System.out.println("Iterating with for-each:");
		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println("Iterating with Iterator:");
		Iterator<Integer> numberIterator = numbers.iterator();
		while (numberIterator.hasNext()) {
			System.out.println(numberIterator.next());
		}

	}

}
