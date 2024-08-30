package com.prowings.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IsEven {

	public static void main(String[] args) {

		Predicate<Integer> isEven = x -> x % 2 == 0 ;
		
		List<Integer> list = Arrays.asList(1,3,5,2,7,9,10,18,19,21,26,33,31,39);
		
		List<Integer> list1 = list.stream()
								   .filter(isEven)
								   .collect(Collectors.toList());
		
							System.out.println(list1);   // [2, 10, 18, 26]

		
	}
	
}
