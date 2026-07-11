package com.coforge.day5;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> numberStack = new Stack<>();
		System.out.println("=== Stack Demo ===");

		numberStack.push(10);
		numberStack.push(20);
		numberStack.push(30);
		System.out.println("Initial stack: " + numberStack);
		System.out.println("Removed top element: " + numberStack.pop());
		System.out.println("After pop: " + numberStack);
		System.out.println("Current top element: " + numberStack.peek());
		System.out.println("Final stack: " + numberStack);


	}

}
