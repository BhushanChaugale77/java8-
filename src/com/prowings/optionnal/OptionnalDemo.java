package com.prowings.optionnal;

import java.util.Optional;

public class OptionnalDemo {

	
	
	
	public static void main(String[] args) {
		
		
		Optional<String> optionnalValue = Optional.ofNullable(getValue());
	
		     //Example of using optional
		optionnalValue.ifPresent(value -> System.out.println("Value is: "+value));
		
		// provide default value if not present
		String result = optionnalValue.orElse("Default value");
		
		System.out.println(result);
		
		//TransForm value if present
		
		Optional<Integer> lengthopt = optionnalValue.map(String::length);
		lengthopt.ifPresent(length -> System.out.println("Length: " + length));
		
		String resultWithSupplier = optionnalValue.orElseGet(() -> "Supplier default Value" );
		
		// Throw an exception if value is not present
		try {
			
			Integer value = lengthopt.orElseThrow(() ->  new RuntimeException("Value is missing"));
			System.out.println(value);
			} catch(RuntimeException e) {

				System.out.println(e.getMessage());
 			}
	}
		
		private static String getValue() {
			
			return null;
		}
		
}
