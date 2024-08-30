package com.prowings.Stream_gpt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEnum {

	public static void main(String[] args) {
		
	Stream<MyEnum> enumStream = Arrays.stream(MyEnum.values());	
		
	//if you want to print all enum constants, you can do:
	
	//enumStream.forEach(System.out::println);
	
	List<MyEnum> filteredValues = enumStream.filter(e -> e == MyEnum.FRIDAY)
											.collect(Collectors.toList());
	System.out.println(filteredValues);
	
	//To count the number of elements in the stream.
	long count = Arrays.stream(MyEnum.values()).count();
	System.out.println(count);
	
	
	//Find the first enum value
	Optional<MyEnum> firstvalue = Arrays.stream(MyEnum.values())
										.findFirst();
	System.out.println(firstvalue);
	
	////Find the last enum value
	
	Optional<MyEnum> anyvalue = Arrays.stream(MyEnum.values())
									   .findAny();
	System.out.println(anyvalue);
	
	}
}
