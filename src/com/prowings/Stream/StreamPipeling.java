package com.prowings.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeling {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		List<Integer> result = numbers.stream()
									.filter(n -> n % 2  == 0)    //intermediate operation : filter even numbers  [2, 4, 6, 8, 10, 12, 14]

									.map(n -> n * n)             //intermediate operation : square each number  [4, 16, 36, 64, 100, 144, 196]

									
									.collect(Collectors.toList());  //Terminal operation : collect the results into a list
				
		        System.out.println(result);
		
	}
	
	
}
