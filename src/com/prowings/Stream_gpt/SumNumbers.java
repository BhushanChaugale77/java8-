package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {

	public static void main(String[] args) {
	
		List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,16,33,66);
	
		int sum = intlist.stream()
				.mapToInt(Integer::intValue)
				.sum();
	
		System.out.println(sum);
	
	
	}
}
