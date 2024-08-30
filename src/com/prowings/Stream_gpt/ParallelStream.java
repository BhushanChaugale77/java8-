package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,17,14,16,18,37,34,46,57,48);
		
							numbers.parallelStream()
									.mapToInt(Integer::intValue)
									.distinct()
									.sum();
							System.out.println(numbers);
		
	}
	
}
