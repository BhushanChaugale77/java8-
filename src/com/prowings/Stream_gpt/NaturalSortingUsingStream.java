package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NaturalSortingUsingStream {

	public static void main(String[] args) {
		
		
		  //Collect a stream to a TreeSet to maintain natural ordering.
     	  	
	       	List<String> words1 = Arrays.asList("Mike DeMoney","Bhushan","Joush","Narayan","Mike","Patrick","Zoya","James");

	       		  	       Set<String> treeSet = words1.stream()
	       		  	    		   					  .collect(Collectors.toCollection(TreeSet::new));
	       		  	       System.out.println(treeSet);
 		
	}
	
	
}
