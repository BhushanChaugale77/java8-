package com.prowings.lambda;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class CompletableFeatureDemo {

	public static void main(String[] args) {
		
//		CompletableFuture.supplyAsync(() -> "Hello" )
//						 .thenApplyAsync(result -> result + "World")
//						 .thenAccept(System.out::println);
	
		
		
		Optional<String> optional = Optional.ofNullable(null);
		optional.ifPresent(System.out::println);
		
	}
	
	
}
