package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CombiningStringUsingStream {

	public static void main(String[] args) {
		
		 //Combine two lists into one by pairing corresponding elements.
	       
	       List<String> list1 = Arrays.asList("a","b","c","d","e");
	       List<String> list2 = Arrays.asList("1","2","3","4","5");
	       
	       Stream<String> zipped = IntStream.range(0, Math.min(list1.size(), list2.size()))
	    		   							.mapToObj(i -> list1.get(i) + list2.get(i));
	       System.out.println(zipped);
		
	}
	
	
}
