package com.prowings.StringReverseWays;

public class StringReverse2 {

	
	public static void main(String[] args) {
		
		String str = "BhushanChavan";		
		
		String reversed = reverseString(str);
		
		System.out.println(reversed);
	}

	public static String reverseString(String str) {
 		
		char[]charArray = str.toCharArray();
		char[]reversedcharArray = new char[charArray.length];
		
		for(int i = 0; i < charArray.length; i++) {
			
			reversedcharArray [i] = charArray[charArray.length -1 -i];
		}
		
		
		 
		return new String(reversedcharArray);
	}
	
	
}
