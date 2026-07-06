package com.coforge.day4_java.Classwork.Polymerphism;

public class Rectangle extends Figure{
	Rectangle(){
		super(10, 20);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle : " + (getLength() * getBreadth()));
	}
}
