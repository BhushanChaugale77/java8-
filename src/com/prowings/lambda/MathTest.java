package com.prowings.lambda;

public class MathTest {

	
	public static void main(String[] args) {
		
		
		MathInterface addition = (a,b) -> a + b;
	    int result = addition.operate(7, 7);
		System.out.println("Result is: "+result);
	}
	
}
