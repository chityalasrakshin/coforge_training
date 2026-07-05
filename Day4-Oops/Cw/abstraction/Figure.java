package com.coforge.day4.abstraction;

public abstract class Figure implements AreaPlan {

	private int length;
	private int breadth;
	private long base;
	private long height;
	private int side;

	public Figure(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Figure(int side) {
		this.side = side;
	}
 
	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public long getBase() {
		return base;
	}

	public long getHeight() {
		return height;
	}

	public int getSide() {
		return side;
	}

	public Figure(long base, long height) {
		this.base = base;
		this.height = height;
	}
	
	public abstract void area();
}