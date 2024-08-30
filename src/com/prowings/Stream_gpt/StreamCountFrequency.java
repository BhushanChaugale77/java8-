package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCountFrequency {

	public static void main(String[] args) {
		
		
		  //Count the frequency of each element in a list.
  	  	List<String> words2 = Arrays.asList("Mike","Bhushan","Narayan", "Joush","Bhushan","Narayan","Mike","Patrick","Zoya","James","zoya","Joush");
   
  	       		  	   Map<String, Long> map = words2.stream()
  	       		  			   						 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
  	       		  	   System.out.println(map);
 
		
	}
	
}
