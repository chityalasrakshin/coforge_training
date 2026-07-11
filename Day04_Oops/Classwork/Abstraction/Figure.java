package com.coforge.day4_java.Classwork.Abstraction;

public abstract class Figure implements Areaplan { //partially defined class
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
	
	abstract public void area(); //abstract method

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
