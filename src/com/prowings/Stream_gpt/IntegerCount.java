package com.prowings.Stream_gpt;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;

public class IntegerCount {

	private static long count;

	public static void main(String[] args) {
		
	  count = Arrays.stream(new Integer[] {1,3,5,7,8,4,9,11,15,18,22,33,55,77,88,67})
									.filter(n -> n >= 3 )
									.count();
		
		System.out.println(count);
		
	}
	
	
}
