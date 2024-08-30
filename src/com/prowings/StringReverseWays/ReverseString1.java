package com.prowings.StringReverseWays;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String str = "BhushanChavan";
		
		String reverse = reverseString(str);
		
		System.out.println(reverse);
		
		
		// by using direct for code optimization 
//		String s1 = new StringBuffer().reverse(str).toString();
//		System.out.println(s1);
		
	}

	public static String reverseString(String str) {
   
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		
		return sb.toString();
	}
	
	
}
