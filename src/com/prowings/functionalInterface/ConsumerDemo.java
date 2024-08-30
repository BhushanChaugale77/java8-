package com.prowings.functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<String>  c =  (s1) -> System.out.println(s1);
		
		c.accept("LalBahadurShastri is Mahesh");
		
		
	}

}
