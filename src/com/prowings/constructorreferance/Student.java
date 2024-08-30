package com.prowings.constructorreferance;

public class Student {

	String name;
	int rollNO;
	int marks;
	int age;
	
	public Student(String name, int rollNO, int marks, int age) {
		super();
		this.name = name;
		this.rollNO = rollNO;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNO=" + rollNO + ", marks=" + marks + ", age=" + age + "]";
	}
	
	
	
	
	
}
