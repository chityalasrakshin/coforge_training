package com.coforge.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> courseById = new HashMap<>();
		System.out.println("=== HashMap Demo ===");
		courseById.put(10, "Java");
		courseById.put(2, "Python");
		courseById.put(20, "Angular");
		courseById.put(4, "React");
		System.out.println("Initial entries: " + courseById);

		courseById.put(25, "Spring Boot");
		System.out.println("After adding course 25: " + courseById);

		courseById.remove(20);
		System.out.println("After removing course 20: " + courseById);

		System.out.println("Course with ID 10: " + courseById.get(10));

		System.out.println("Course IDs:");
		for (int courseId : courseById.keySet()) {
			System.out.println(courseId);
		}

		System.out.println("Course entries:");
		Set<Entry<Integer, String>> courseEntries = courseById.entrySet();
		for (Entry<Integer, String> courseEntry : courseEntries) {
			System.out.println(courseEntry.getKey() + " " + courseEntry.getValue());
		}

	}

}
