package com.prowings.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		 // Create a Supplier that generates a random number
		Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(77);
		
        // Use the Supplier to get a random number
		Integer randomNumber = randomNumberSupplier.get();
		
		System.out.println(randomNumber);
	}
	
	
}
