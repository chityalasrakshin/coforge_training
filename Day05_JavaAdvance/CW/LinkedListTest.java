package com.coforge.day5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		System.out.println("=== LinkedList Demo ===");

		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(35);
		numbers.add(20);
		System.out.println("Initial list: " + numbers);
		System.out.println("First element: " + numbers.get(0));
		System.out.println("Removed element: " + numbers.remove(3));
		System.out.println("After removal: " + numbers);
		System.out.println("Replaced element: " + numbers.set(1, 90));
		System.out.println("Updated list: " + numbers);

//		for (int index = 0; index < numbers.size(); index++) {
//			System.out.println(numbers.get(index));
//		}

		System.out.println("Iterating with Iterator:");
		Iterator<Integer> numberIterator = numbers.iterator();
		while (numberIterator.hasNext()) {
			System.out.println(numberIterator.next());
		}

	}

}
