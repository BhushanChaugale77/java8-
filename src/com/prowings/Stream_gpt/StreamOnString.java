package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOnString {

	public static void main(String[] args) {
		
		List<String> strlist = Arrays.asList("joush blouch","james gosling","Patrick Naughton","mike sheridan","mike Demony","bhushan chavan");
		
		
					List<String> collect = strlist.stream()
													.map(String::toUpperCase)
													.collect(Collectors.toList());
					System.out.println(collect);
		
	}
	
}
