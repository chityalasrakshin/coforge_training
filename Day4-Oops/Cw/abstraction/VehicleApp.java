package com.coforge.day4.abstraction;

public class VehicleApp {
	
	public static void main(String args[]) {
//		Bike honda = new Bike();
//		honda.noOfWheels();
//		honda.brandName();
//		honda.noOfEngine();
//		Scooty s1 = new Scooty();
//		s1.noOfWheels();
//		s1.brandName();
//		s1.noOfEngine();
		VehiclePlan vehicle;
		vehicle = new Bike();
		vehicle.noOfWheels();
		vehicle.brandName();
		vehicle.noOfEngine();
		
		vehicle = new Scooty();
		vehicle.noOfWheels();
		vehicle.brandName();
		vehicle.noOfEngine();
	}

}
