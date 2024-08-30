package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingFirstElement {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,4,6,3,7,4,9,11,22,33,99,33,11,56,78,98,54,23,63,83,94,40);
		
		Optional<Integer> first = numbers.stream()
										 .filter(n -> n % 2 == 0)
										 .findFirst();
					System.out.println(first);
		
					
		Optional<Integer> any = numbers.stream()
										.filter(n -> n % 2 == 0)
										.findAny();
							System.out.println(any);
							
							//sort the list
		
							List<Integer> collect = numbers.stream()
									.sorted()
									.collect(Collectors.toList());
							System.out.println(collect);
					
							
			// Reversing a list
							
							Set<Integer> set = numbers.stream()
 									.sorted(Comparator.reverseOrder())
									.collect(Collectors.toSet());	
							System.out.println(set);
	}
}
