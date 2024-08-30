package com.prowings.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambadaReverseSortExample {

	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<>(Arrays.asList("Banana","Apple","Pinaple","Kiwi","Papaya","Sitafal"));
		
		str.sort((s1,s2) -> s2.compareTo(s1));
		
		System.out.println(str);
		
	}
	
}
