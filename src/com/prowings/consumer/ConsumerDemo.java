package com.prowings.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Joush", "Mike", "Patrik", "Mike D");

		Consumer<String> printConsumer = n -> System.out.println(names);

		names.forEach(printConsumer);

//		for (String s : names)
//			System.out.println(s);
	}

}
