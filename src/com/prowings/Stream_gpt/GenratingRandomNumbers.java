package com.prowings.Stream_gpt;

import java.util.stream.Stream;

public class GenratingRandomNumbers {

	public static void main(String[] args) {
		
		Stream<Double> randomNumbers = Stream.generate(Math::random).limit(10);
		
		System.out.println(randomNumbers);
		
	}
	
}
