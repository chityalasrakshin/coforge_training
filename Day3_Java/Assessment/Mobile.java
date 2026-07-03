package com.coforge.Day3;

public class Mobile {
	private String brand;
	private String model;
	private int ram;
	private double price;

	public Mobile(String brand, String model, int ram, double price) {
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.price = price;
	}

	// Getters & Setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if (ram > 0) {
			this.ram = ram;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	@Override
	public String toString() {
		return "Mobile [Brand=" + brand + ", Model=" + model + ", RAM=" + ram + "GB, Price=" + price + "]";
	}
}