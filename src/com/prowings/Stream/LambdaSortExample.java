package com.prowings.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSortExample {

	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>(Arrays.asList("Banana","Apple","Pinaple","Orange","Mango"));
		
		strings.sort((s1,s2) -> s1.compareTo(s2));

		System.out.println("Sorted List : "+strings);
		
	}
}
