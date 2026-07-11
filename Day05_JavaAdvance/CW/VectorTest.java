package com.coforge.day5;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		System.out.println("=== Vector Demo ===");

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
		
		System.out.println("Iterating with Enumeration:");
		Enumeration<Integer> numberEnumeration = numbers.elements();
		while (numberEnumeration.hasMoreElements()) {
			System.out.println(numberEnumeration.nextElement());
		}

	}

}
