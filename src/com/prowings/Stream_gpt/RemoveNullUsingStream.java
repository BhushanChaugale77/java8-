package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullUsingStream {

	public static void main(String[] args) {
		
		 //  Remove all null values from a list.
	       
	       List<String> words = Arrays.asList(null,"Bhushan","Joush",null,"Mike","Patrick",null,"James");
	       						List<String> filteredLisst = words.stream()
	       														  .filter(Objects::nonNull)
	       														  .collect(Collectors.toList());
	       						System.out.println(filteredLisst);
 		
		
	}
	
	
}
