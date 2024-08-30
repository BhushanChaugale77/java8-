package com.prowings.Stream1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindLongestWord {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("James Gosling","Mike DeMoney","Mike Sheridan","Patrick Naughton","Joshua Bloch","Bill Joy","Arthur van Hoff","Bhushan Chaugale");
		
										Optional<String> max = words.stream()
											 .max(Comparator.comparingInt(String::length));
										
										System.out.println(max);
		
		System.out.println("================================Split a list into sublists of a given size==================================");
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);	
		
		int partionsize = 3;
		
		List<List<Integer>> partitions = IntStream.range(partionsize, numbers.size())
												  .boxed()
												  .collect(Collectors.groupingBy(i -> i / partionsize))
												  .values()
												  .stream()
												  .map(indices -> indices.stream().map(numbers::get).collect(Collectors.toList()))
												  .collect(Collectors.toList());
		
		System.out.println(partitions);
		
										
		
	}
}
