package com.prowings.FactoryDesignPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
	
	VehicleFactory vehicleFactory = new VehicleFactory();
	
	Vehicle vehicle1 = vehicleFactory.getVehicle("Car");
	vehicle1.drive();
	
	Vehicle vehicle2 = vehicleFactory.getVehicle("Bike");
	vehicle2.drive();
	
	Vehicle vehicle3 = vehicleFactory.getVehicle("Truck");
	vehicle3.drive();
	}
}
