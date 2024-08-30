package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoiningElements{

	public static void main(String[] args) {
		
		
		 //Join elements of a list into a single string with a delimiter.
  	    List<String> words3 = Arrays.asList("Mike","Bhushan","Narayan", "Joush","Bhushan","Narayan","Mike","Patrick","Zoya","James","zoya","Joush");
	   
  	       			String joinedString = words3.stream()
  	       				 .collect(Collectors.joining(", "));
  	       		 System.out.println(joinedString);
 		
		
	}
	
}
