package com.prowings.lambda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ImprovedDateTime {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalDate birthday = LocalDate.of(1992, Month.NOVEMBER, 26);
		
		Period age = Period.between(birthday, today);
		
		System.out.println("age: " +age);
		
		
		Runnable r = () -> System.out.println("Running");
		r.run();
		
		UnaryOperator<Integer> square = x -> x * x;
		int res = square.apply(5);
		System.out.println(res);
		
		
		BinaryOperator<Integer> addition = (a, b) -> a + b;
		Integer sum = addition.apply(5, 7);
		System.out.println(sum);
		
		
	}
	
}
