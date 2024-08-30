package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindingSecondLargestElement {

	public static void main(String[] args) {
		
	
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,11,33,44,56,7,9,10);
	
	Optional<Integer> secondLargest = numbers.stream()
											 .sorted(Comparator.reverseOrder())
											 .skip(1)
											 .findFirst();
	System.out.println(secondLargest);
	
	
	// for string
   	List<String> words = Arrays.asList("Mike DeMoney","Bhushan","Joush","Narayan","Mike","Patrick","Zoya","James");

   	   Optional<String> first = words.stream()
   									 .sorted(Comparator.reverseOrder())
   									 .skip(2)
   									 .findFirst();
   								System.out.println(first);
											 
	}
	
}
