package com.prowings.Stream1;

import java.util.stream.Stream;

public class FibonaciStream {

	public static void main(String[] args) {
		
	Stream<Integer> FibonaciNumbers	= Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
											.limit(20)
											.map(t -> t[0]);
	
			FibonaciNumbers.forEach(System.out::println);
	}
		
		
}

