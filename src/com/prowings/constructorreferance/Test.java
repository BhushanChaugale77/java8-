package com.prowings.constructorreferance;

public class Test {

	
	public static void main(String[] args) {
		
//		Constructor referance is possible by 2 ways 
        // way 1 by using lambda expression 
		
		Interf i = (name,rollNo,marks,age) -> new Student(name,rollNo,marks,age);
		 
		System.out.println(i.get("Shivaji", 33, 99, 22));
		
		
		// way 2 by creating method referance we can create object
		
		Interf i1 = Student :: new;
		
		System.out.println(i1.get("Bhushan", 74, 77, 32));
		
		
	}
}
