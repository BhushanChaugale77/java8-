package com.prowings.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferance {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		
		List<String> list = numbers.stream()
							  .map(String::valueOf)
							  .collect(Collectors.toList());
		
		System.out.println(list);
		
	}
	
}
