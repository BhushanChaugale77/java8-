package com.prowings.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringUsingRegularjava8 {

	public static void main(String[] args) {
		
	
	String s = "I am Bhushan Chavan from gargoti Kolhapur";
	
	 List<String> words = Arrays.asList(s.split(" "));
	 
	 Collections.reverse(words);
	 
	 List<String> collect = words.stream()
	 	                         .map(w -> w.equals(words.get(0))? w.toLowerCase():w)
	 	                          .collect(Collectors.toList());
	 	  
	       System.out.println(String.join(" ", collect));
	
	}
	
	
}
