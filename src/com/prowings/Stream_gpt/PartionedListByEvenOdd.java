package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionedListByEvenOdd {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,4,6,8,9,11,14,16,17,19,20,21,26,28,27,33,37,39);
		
		Map<Boolean, List<Integer>> partioned = numbers.stream()
														.collect(Collectors.partitioningBy(n -> n % 2 ==0));
		
		System.out.println(partioned);
		
		
	}
}
