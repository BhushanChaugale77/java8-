package com.prowings.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

	public static void main(String[] args) {
		
	
	Function<String, Integer> stringLength = s -> s.length();
	
	List<String> list = Arrays.asList("Joush","Bhushan","Patrik","Mike","Sheriden");
	
	List<Integer> length = list.stream()
							   .map(stringLength)
							   .collect(Collectors.toList());
	
			System.out.println(length);
	
	
	}
	
	
}
