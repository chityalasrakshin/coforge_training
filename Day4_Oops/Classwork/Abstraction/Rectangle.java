package com.coforge.day4_java.Classwork.Abstraction;

public class Rectangle extends Figure{ //Concrete class
	Rectangle(){
		super(10, 20);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle : " + (getLength() * getBreadth()));
	}
}
