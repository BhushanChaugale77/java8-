package com.prowings.lambda;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie","Bhushan","Mike","Joush","Patrik");

		  names.forEach(name -> System.out.println(name));
		
	}
	
}
