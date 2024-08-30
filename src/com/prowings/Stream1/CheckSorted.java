package com.prowings.Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CheckSorted {

	public static void main(String[] args) {
		List<Integer> sortedList1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> sortedList2 = Arrays.asList(1,3,2,5,4,6,10,8,9,7);
		
		boolean isSorted = IntStream.range(0, sortedList1.size() -1)
									.allMatch(i -> sortedList1.get(i) <= sortedList1.get(i + 1));
		System.out.println("Sorted List is sorted: " + isSorted);
		
		// to check secondlist
		
		boolean isSorted1 = IntStream.range(0, sortedList2.size() -1)
									 .allMatch(i -> sortedList2.get(i) <= sortedList1.get(i + 1));
		System.out.println("Sorted List is sorted: " + isSorted1);

	}
	
	
}
