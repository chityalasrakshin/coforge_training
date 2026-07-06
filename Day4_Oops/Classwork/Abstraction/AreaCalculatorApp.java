package com.coforge.day4_java.Classwork.Abstraction;

public class AreaCalculatorApp {
	public static void main(String[] args) {
//		Rectangle rectangle = new Rectangle();
//		Square square = new Square();
//		Triangle triangle = new Triangle();
//		
//		rectangle.area();
//		square.area();
//		triangle.area();
		
		Areaplan figure;
		
		figure = new Rectangle(); // dynamic method dispatching - when the method is overridden 
		figure.area();            // the version which method is called is decided at runtime by
		                          //checking whose object is created!
		
		figure = new Square();
		figure.area();
		
		figure = new Triangle();
		figure.area();
		
		
//		Rectangle rectangle = (Rectangle) new Figure(10); // the reverse is not possible
	}

}
