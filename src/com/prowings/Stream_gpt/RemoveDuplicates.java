package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> intlist = Arrays.asList(1,1,2,3,4,7,5,3,8,5,9,5,3,4,33,55,44,33,66,77,7,8);
		
		List<Integer> collect = intlist.stream()
				.sorted()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
	
}
