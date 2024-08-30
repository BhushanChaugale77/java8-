package com.prowings.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringUsingRegular {

	public static void main(String[] args) {
		
	
	String s = "I am Bhushan Chavan from gargoti Kolhapur";
	
	List<String> strlist = Arrays.asList(s.split(" "));
	
     Collections.reverse(strlist);
     System.out.println(strlist);
     
     String join = String.join(" ", strlist);
     
     System.out.println(join);
     
     String[] split = s.split(" ");
     // using for loop
     for(int i = split.length-1; i>0; i--) {
    	 
    	 System.out.print(split[i]+" ");
     }
	
	}
	
	
}
