package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CreateTheMap {

	public static void main(String[] args) {
	
		List<String> strlist =Arrays.asList("joush blouch","james gosling","Patrick Naughton","mike sheridan","mike Demony","bhushan chavan");
	
		//creating map from list
					
								Map<Integer,String> map = strlist.stream()
										.collect(Collectors.toMap(String::length, Function.identity(),(e1,e2) -> e1));
							System.out.println(map);
	}
}
