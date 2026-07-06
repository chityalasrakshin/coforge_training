package com.coforge.day4_java.Classwork.Abstraction;

public class Square extends Figure {
	
	Square(){
		super(10);
	}
	
	@Override
	public void area() {
		int side = getSide();
		System.out.println("Area of Square : " + (side * side));
	}

}
