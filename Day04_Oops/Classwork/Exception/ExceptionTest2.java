package com.coforge.day4_java.Classwork.Exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
        
		//int a = 10 / 0;  // execution stops here
		//int b = Integer.parseInt("abc");
		int[] arr = new int[-5];
		
		}catch(ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Error : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally { //the code must executes irrespective of exception
			System.out.println("Finally block");
		}
		
		System.out.println("After Exception");
	}
}
