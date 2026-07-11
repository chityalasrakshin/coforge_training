package com.coforge.day4_java.Classwork.Polymerphism;

public class Figure {
	private int length;
	private int breadth;
	private int side;
	private long base;
	private long height;
	
	public Figure(int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	
	public Figure(int side) {
		this.side = side;
	}
	
	public Figure(long b, long h) {
		this.base = b;
		this.height = h;
	}
	
	public  void area() {
		System.out.println("Cannot Define");
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getSide() {
		return side;
	}

	public long getBase() {
		return base;
	}

	public long getHeight() {
		return height;
	}
}
