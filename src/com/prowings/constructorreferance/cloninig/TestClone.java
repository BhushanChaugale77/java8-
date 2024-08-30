package com.prowings.constructorreferance.cloninig;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address address = new Address(77,"Kolhapur");
		Student student = new Student(99,"Sushant",address);

		System.out.println(student);
		System.out.println(student.hashCode());

		
		Student student1 = (Student)student.clone();
		System.out.println( "student1: "+student1);
 		System.out.println(student1.hashCode());
		
 		System.out.println(student == student1);
 		
 		
 		
 		System.out.println("<<<<<<<<<<<<upgredaing address of student1 >>>>>>>>>>>");
		student1.getAddress().setCity("Pune");	
		System.out.println("studnet1 changed: "+student1);

		
		System.out.println("<<<<<<<<<< Afetr updating of Address of student1");
		
		System.out.println(student);
		System.out.println(student1);
		
 		System.out.println(student == student1);

		
	}
	
	
}
