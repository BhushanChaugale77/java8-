package com.prowings.lambda;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	
	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		int sum = numbers.parallelStream()
						 .reduce(0, Integer::sum);
		
		
	}
	
	
}
