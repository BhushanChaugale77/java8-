package com.prowings.Stream1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffleListExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);

		List<Integer> shuffledList = numbers.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), collected -> {
					Collections.shuffle(collected);
					return collected.stream();
				})).collect(Collectors.toList());

		System.out.println("Original List: " + numbers);
		System.out.println("Shuffled List: " + shuffledList);
	}
}
