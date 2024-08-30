package com.prowings.Stream;

import java.util.Arrays;
import java.util.List;

public class SumByJava8 {

	public static void main(String[] args) {
		// Create a list of integers
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		
		 // Calculate the sum using the Stream API
		 
		int sum = numbers.stream()
						 .mapToInt(Integer::intValue)
						 .sum();
		
		System.out.println("Sum using java8 Stream mapToInt: "+sum);
		
	}
	
	
	
}
