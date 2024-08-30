package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> intlist = Arrays.asList(3,4,7,6,11,13,17,19,21,22,25,27,33,32,36,77,99);
		
					List<Integer> collect = intlist.stream()
													.filter(n -> n % 2 == 0)
													.collect(Collectors.toList());
		
					System.out.println(collect);
		
					// to find maximum number
					
				Optional<Integer> max = intlist.stream()
												.max(Integer::compareTo);
				System.out.println(max);
				
					// to find minimum number
				Optional<Integer> min = intlist.stream()
												.min(Integer::compareTo);
				System.out.println(min);
	}
	
	
}
