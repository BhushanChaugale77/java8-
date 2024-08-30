package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfList {

	
	public static void main(String[] args) {
		
		List<List<String>> listOfLists = Arrays.asList(

				Arrays.asList("joush blouch","james gosling","Patrick Naughton","mike sheridan","mike Demony","bhushan chavan"),
				Arrays.asList("A","B","c","D","Z","L","W","Q","R"));
		
			List<String> collect = listOfLists.stream()
												.flatMap(List::stream)
												.collect(Collectors.toList());
		
			System.out.println(listOfLists);
	}	
}

