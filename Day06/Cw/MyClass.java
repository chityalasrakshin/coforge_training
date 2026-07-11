package com.coforge.day6;

@FunctionalInterface
interface Calculator {
	int calculate(int firstNumber, int secondNumber);
}

public class MyClass {

	public static void main(String[] args) {
		// Note: one functional interface can hold different lambda implementations.
		Calculator calculator = (firstNumber, secondNumber) -> firstNumber + secondNumber;
		System.out.println(calculator.calculate(10, 20));

		// Note: reassigning the lambda changes the operation, not the variable type.
		calculator = (firstNumber, secondNumber) -> firstNumber - secondNumber;
		System.out.println(calculator.calculate(10, 20));

		calculator = (firstNumber, secondNumber) -> firstNumber * secondNumber;
		System.out.println(calculator.calculate(10, 20));

		calculator = (firstNumber, secondNumber) -> firstNumber / secondNumber;
		System.out.println(calculator.calculate(20, 10));
	}

}
