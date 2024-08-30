package com.prowings.Stream1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharToString {

	public static void main(String[] args) {
		
	 
		
		IntStream intstream = "Bhushan".chars();
		
		System.out.println("IntStream : " +intstream);
		
		Stream<Character> characterStream = intstream.mapToObj(c -> (char)c);
													  
		
		 characterStream.forEach(System.out::println);
		 
		 
		 
	}
	
}
