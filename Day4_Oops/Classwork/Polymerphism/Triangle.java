package com.coforge.day4_java.Classwork.Polymerphism;

public class Triangle extends Figure{
	Triangle(){
		super(10L, 20L);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Triangle : " + (getBase() * getHeight()) / 2 );
	}

}
