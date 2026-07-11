package com.coforge.day4_java.Classwork.Abstraction.multiple_inheritance;

public class Test implements C {
	public static void main(String[] args) {
		Test test = new Test();
		test.sum();
	}
	
	public void sum() {
		System.out.println(A.a + B.b);
	}

}
