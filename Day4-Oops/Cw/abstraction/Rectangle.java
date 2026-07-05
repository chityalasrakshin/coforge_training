package com.coforge.day4.abstraction;

public class Rectangle extends Figure {
	public Rectangle() {
		super(10, 20);
	}
	

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is : " + (getLength() * getBreadth()));
	}

}
