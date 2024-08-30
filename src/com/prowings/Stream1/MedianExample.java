package com.prowings.Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MedianExample {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(3,1,4,1,5,9,2);
		
		
		OptionalDouble median = numbers.stream()
									   .sorted()
									   .skip((numbers.size() - 1) / 2)
									   .limit(2 - numbers.size() % 2)
									   .mapToInt(Integer::intValue)
									   .average();
		
		System.out.println("Median: " +(median.isPresent() ? median.getAsDouble(): "no median"));
	}
}
