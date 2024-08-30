package com.prowings.lambda;

import java.util.function.Function;

public class ComparatorDemo {

	
	public static void main(String[] args) {
		
		
		Function<String, Integer> stringLength = (String s) -> {
			
			int length = s.length();
			
			System.out.println("Length of String: " +length);
		
			return length;
		};
		
		int len = stringLength.apply("BHUSHAN");
		
	}
}
