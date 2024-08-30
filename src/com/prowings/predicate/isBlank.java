package com.prowings.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class isBlank {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Bhushan","Mike","   ", "Joush", " ", "", "Patrik");
		
		Predicate<String> isBlank = s -> s.isBlank();
		
		Long isBlankinString = list.stream()
								   .filter(isBlank)
								   .count();
		
		System.out.println("No of Strings which is blank in given String : " +isBlankinString);
		
	}
	
	
}
