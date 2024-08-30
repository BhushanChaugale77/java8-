package com.prowings.StringReverseWays;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "bhushan";
		
		boolean isPalindrome = isPalindromeOrNot(str);
		
		System.out.println(isPalindrome);
		
	}

	public static boolean isPalindromeOrNot(String str) {
 
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			
			if(str.charAt(left)!=str.charAt(right))
				return false;
			
			left++;
			right--;
			
		}	
		
		return true;
	}
}
