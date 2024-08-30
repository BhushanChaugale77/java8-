package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchCondition {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,33,44,55,66);
		
		
		boolean allPsitive = numbers.stream()
									.allMatch(n -> n > 0);
		
		System.out.println(allPsitive);
	    
		System.out.println("+===============================================+");

		
		boolean anyNegative = numbers.stream()
				                     .anyMatch(n -> n < 0);
		System.out.println(anyNegative);
       
		System.out.println("+===============================================+");
		
        boolean noneZero = numbers.stream()
        						  .noneMatch(n -> n == 0);
        
        System.out.println(noneZero);
       
       System.out.println("+===============================================+");
        
        
        Stream<String> concat = Stream.concat(Stream.of("A","B","C","D","E","F"),
        											Stream.of("G","H","I","J","K","L","M","N"));
        		System.out.println(concat);
        	
  	       System.out.println("+===============================================+");

  	       //Skip the first 3 elements of a stream.
  	       List<Integer> skippedList = numbers.stream()
  	       		  .skip(3)
  	       		  .collect(Collectors.toList());
  	       System.out.println(skippedList);
  	       
  	       System.out.println("+===============================================+");

  	       //Limit the stream to the first 5 elements.
  	       List<Integer> limitedList = numbers.stream()
  	       		   .limit(5)
  	       		   .collect(Collectors.toList());
  	       System.out.println(limitedList);
  	       System.out.println("+===============================================+");

  	       //Create a stream from a range of numbers.
  	       IntStream.range(1, 10).forEach(System.out::println);
  	       System.out.println("+===============================================+");

	}
	
}
