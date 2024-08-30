package com.prowings.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny_First {

	public static void main(String[] args) {
		
	
		List<String> list = Arrays.asList("Bhushan","Mike","MikeD", "Patrik","Sheriden");
		
		Optional<String> first = list.stream().findFirst();
		
		System.out.println(first);
		
		Optional<String> any = list.stream().findAny();
		
		System.out.println(any);

	}
	
}
