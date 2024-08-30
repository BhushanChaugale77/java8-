package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringSegrigation {

	public static void main(String[] args) {
		
		List<String> strlist = Arrays.asList("joush blouch","james gosling","Patrick Naughton","mike sheridan","mike Demony","bhushan chavan");
		
		Map<Integer, List<String>> groupedByLength = strlist.stream()
															.collect(Collectors.groupingBy(String::length));
		
		System.out.println(groupedByLength);
		
		
	}
	
	
}
