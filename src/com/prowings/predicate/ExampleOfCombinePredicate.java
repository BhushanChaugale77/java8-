package com.prowings.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExampleOfCombinePredicate {

	
	public static void main(String[] args) {
		
		Predicate<String> startsWithA = s -> s.startsWith("A");
		Predicate<String> endsWithX = s -> s.endsWith("x");
		
		Predicate<String> combinedPredicate = startsWithA.and(endsWithX);
		
		List<String> list = Arrays.asList("Avinash","Amit","Amey","Avinox","Amdox","Ashx");
		
		
		List<String> list1 = list.stream()
								 .filter(combinedPredicate)
								 .collect(Collectors.toList());
		   System.out.println(list1);
		
		
		
	}
	
	
}
