package com.prowings.Stream;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		 // Generate a random int
		int randomInt = random.nextInt();
		System.out.println("RandomInt : "+randomInt);
		
		  // Generate a random int between 0 and 99
		int randomIntBounded = random.nextInt(100);
		System.out.println("Random int between 0 to 99 : "+randomIntBounded);
		
		  // Generate a random double
		double randomDouble = random.nextDouble();
		System.out.println("Random Double : "+randomDouble);
		
        // Generate a random boolean
		boolean randomBoolean = random.nextBoolean();
		System.out.println(randomBoolean);
		
	}
	
	
}
