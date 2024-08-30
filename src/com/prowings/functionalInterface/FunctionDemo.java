package com.prowings.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		
		Function<String ,Integer> f = i -> i.length();
	
		String I1 = "BHUSHAN";
		
		System.err.println(f.apply(I1));
		
		String i2 = "Hi i am solving Java 8 Problem";
		
		System.err.println(f.apply(i2));		
		
	}
	
	
	
}
