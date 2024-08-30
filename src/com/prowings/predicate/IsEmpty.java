package com.prowings.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IsEmpty {

	
	public static void main(String[] args) {
		Predicate<String> isEmpty = s -> s.isEmpty();
		
		List<String> list = Arrays.asList("Bhushan","Mike","Patrik","MikeD","","");
		
		
		Long emptyStringCount = list.stream()
								 .filter(isEmpty)
								 .count();
 		  		
				System.out.println("No of Empty String: " +emptyStringCount);
	}
}
