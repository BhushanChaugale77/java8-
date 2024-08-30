package com.prowings.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindExample {

	public static void main(String[] args) {
		
		List<String> strlist = Arrays.asList("James Gosling", "Joshua Bloch","Mike DeMoney","Mike Sheridan","Patrick Naughton","Bhushan","Neal Gafter");
		
        // Using findFirst() - Guaranteed to return "James Gosling"

		Optional<String> first = strlist.stream().findFirst();
		first.ifPresent(System.out::println);
		
        // Using findAny() - May return "James Gosling" in sequential, but not guaranteed in parallel
		Optional<String> any = strlist.stream().findAny();
		any.ifPresent(System.out::println);
		
		// Using findAny() - in parallel
		Optional<String> any1 = strlist.parallelStream().findAny();
		any1.ifPresent(System.out::println);
	}
	
	
	
}
