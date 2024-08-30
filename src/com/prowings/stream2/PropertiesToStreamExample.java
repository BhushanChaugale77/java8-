package com.prowings.stream2;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Stream;

public class PropertiesToStreamExample {

	public static void main(String[] args) {
		
		// create properties object
		Properties properties = new Properties();
		
		//populate the properties objects with key value pairs
		
		properties.setProperty("username", "admin");
		properties.setProperty("password", "12345");
		properties.setProperty("url", "http://example.com");
		
        // Step 3: Retrieve the set of key-value pairs (Map.Entry<Object, Object>)
		Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
		
        // Step 4: Convert the entry set to a Stream
		Stream<Map.Entry<Object, Object>> stream = entrySet.stream();
		
        // Step 5: Use the Stream to process key-value pairs (for example, print them)
		stream.forEach(entry -> {
			System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
		});
		
	}
}
