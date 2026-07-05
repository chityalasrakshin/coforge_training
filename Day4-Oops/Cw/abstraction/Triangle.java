package com.coforge.day4.abstraction;

public class Triangle extends Figure {
	public Triangle() {
		super(10L, 10L);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("The area of Triangle is : " + 0.5 * (getBase() * getHeight()));
	}

}
