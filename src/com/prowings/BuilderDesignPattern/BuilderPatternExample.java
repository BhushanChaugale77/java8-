package com.prowings.BuilderDesignPattern;

public class BuilderPatternExample {

	public static void main(String[] args) {
		
        // Create a house with walls, roof, and garden

		House houseWithGarden = new House.HouseBuilder("Brick Walls", "Concreate Roof")
										.setGarden(true)
										.build();
		
		// create a house with walls, roof, & garage
		
		House houseEithGarage = new House.HouseBuilder("Brick walls", "Concreate Roof")
										  .setGarage(true)
										  .build();
		
        // Create a house with walls, roof, garden, and garage

		House fullHouse = new House.HouseBuilder("Brick Walls", "Concreate Roof")
									.setGarage(true)
									.setGarden(true)
									.build();
		
		System.out.println(houseWithGarden);
        System.out.println(houseEithGarage);
        System.out.println(fullHouse);
									
		
	}
	
	
}
