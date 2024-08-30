package com.prowings.FactoryDesignPattern;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType) {
		if(vehicleType == null) {
			
			return null;
		}
		
		if(vehicleType.equalsIgnoreCase("CAR")) {
			return new Car();
		} else if(vehicleType.equalsIgnoreCase("Bike")) {
			
			return new Bike();
		}else if(vehicleType.equalsIgnoreCase("Truck")) {
			
			return new Truck();
			
		}
		
		return null;
		
		
	}
	
}
