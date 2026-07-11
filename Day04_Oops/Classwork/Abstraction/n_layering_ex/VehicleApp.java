package com.coforge.day4_java.Classwork.Abstraction.n_layering_ex;

public class VehicleApp {
	public static void main(String[] args) {
		VehiclePlan yamaha;
		yamaha = new Bike();
		yamaha.noOfEngines();
		yamaha.noOfWheels();
		yamaha.brandName();
	}
}
