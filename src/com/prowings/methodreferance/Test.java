package com.prowings.methodreferance;

public class Test {

	public static void sum(int x, int y) {
		System.out.println("the sum is : "+(x+y));
	}
	
	public static void main(String[] args) {
		
		Interf i = (a,b) -> System.out.println("the Sum is: "+(a+b));
		i.add(7,4);
		
		Interf i1 = Test :: sum;
		i1.add(10, 30);

		
		
		
		// here functional interface add() method refering Test class sum() method. 
		//  in method referance we can not care about modifires & return type only parameters must be matched
		// 
	}
	
}
