package com.prowings.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		
		Predicate<Integer> p = i -> i % 2 == 0;
		
		
		boolean result = p.test(7);
		System.out.println("Result = "+result);
		
 
		boolean result1 = p.test(10);
		System.out.println("Result1 = "+result1);
		
		
		
	}
	
}
