package com.prowings.StringReverseWays;

public class StringReverse {

	
	public static void main(String[] args) {
		
		String str = "BhushanChavan";		
		
		String reversed = reverseString(str);
		
		System.out.println(reversed);
	}

	public static String reverseString(String str) {
 		
		String empty ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			empty+=str.charAt(i);
		}
		
		return empty;
	}
	
	
}
