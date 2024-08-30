package com.prowings.functionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<Date> s1 = () -> new Date();
		
		System.out.println("Current date is = "+s1.get());
		
		
	}

}
