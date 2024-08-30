package com.prowings.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo3 {

	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
	
	List<Integer> evennumbers = numbers.stream()
										.filter(n -> n % 2 == 0)
										.collect(Collectors.toList());
	
	System.out.println(evennumbers);

	}
}
