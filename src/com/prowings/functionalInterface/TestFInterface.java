package com.prowings.functionalInterface;

public class TestFInterface {

	
	public static void main(String[] args) {
		
		functionalInterface fi = (a,b) -> System.out.println("Addition is "+(a+b)); 
		
		   fi.add(7, 7);
		   fi.add(15, 15);
		 
		
		
	}
}
