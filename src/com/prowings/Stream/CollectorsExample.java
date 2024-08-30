package com.prowings.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {

		List<String> strlist = Arrays.asList("Joush12", "Mike", "Sunil", "Bhushan1", "Patrik");

		// collect to list
		List<String> list = strlist.stream().collect(Collectors.toList());
		System.out.println("List: " + list);

		// collect to set
		Set<String> set = strlist.stream().collect(Collectors.toSet());
		System.out.println("Set : " + set);

		// Concatenate into a single string
		String concatinated = strlist.stream().collect(Collectors.joining());
		System.out.println("ConcatinatedString: " + concatinated);

		// Group by the length of the name
		Map<Integer, List<String>> groupedByLength = strlist.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Grouped by length: " + groupedByLength);

        // Partition by name length greater than 3
		Map<Boolean, List<String>> partioned = strlist.stream().collect(Collectors.partitioningBy(name -> name.length() >3));
		System.out.println("Partitioned by length > 3: " +partioned);
		
		// Collect to Map (length as key, name as value)
		Map<Integer, String> map = strlist.stream().collect(Collectors.toMap(String::length, name -> name));
		System.out.println("Map: " + map);

	}

}
