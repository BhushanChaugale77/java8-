package com.prowings.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferance2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("bhushan","mike","joush","patrik","sheridon");
		
	
		names.forEach(System.out::println);
		
		
		List<String> Uppercaselist = names.stream()
										   .map(String::toUpperCase)
										   .collect(Collectors.toList());
		
		System.out.println(Uppercaselist);
		
	}
	
}
