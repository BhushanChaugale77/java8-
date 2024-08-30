package com.prowings.treeset;

public class StringLitralDemo {

	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		
 		
	    String s = s1.concat("World");
		
	final String s5 = s;
	
		String s4 = "World";

 		
		String s2 = "HelloWorld";
		
		String s3 = "HelloWorld";
		
		System.out.println(s2==s3);
		
		System.out.println(s == s2);
 	
		System.out.println(s == s4);
		
		System.out.println(s == s5);

		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
	}
	
	
}
