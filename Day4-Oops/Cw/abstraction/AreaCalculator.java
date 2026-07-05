package com.coforge.day4.abstraction;

public class AreaCalculator {
	public static void main(String args[]) {
//		Rectangle rectangle = new Rectangle();
//		rectangle.area();
//		Square sqaure = new Square();
//		sqaure.area();
//		Triangle triangle = new Triangle();
//		triangle.area();
		//RUN TIME POLYMORPHISM
		Figure figure;
		figure = new Rectangle();
		figure.area();
		
		figure = new Square();
		figure.area();
		
		figure = new Triangle();
		figure.area();

	}

}
