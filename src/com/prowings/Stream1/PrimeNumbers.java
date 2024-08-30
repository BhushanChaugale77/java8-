package com.prowings.Stream1;

import java.util.stream.Stream;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Stream<Integer> infiniteNumbers = Stream.iterate(2,i -> i + 1)
												.filter(PrimeNumbers::isPrime)
												.limit(10);
		
 		infiniteNumbers.forEach(System.out::println);
	}
	
	public static boolean isPrime(int number) {
		
		if(number < 2) return false;
		
		for(int i = 2; i <= Math.sqrt(number); i++) {
			
			if (number % i == 0) return false;
		}
		return true;
	}
	
}
