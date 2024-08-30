package com.prowings.functionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApiDemo {
	
	public static void main(String[] args) {
		
	 List<Employee> list = new ArrayList<>();
	 
	 list.add(new Employee(77,"Bhushan",77777));
	 list.add(new Employee(99,"Vaibhav",100000));
	 list.add(new Employee(33,"Mahesh",8888888));
	 list.add(new Employee(44,"BailBudhi",6666666));
	 list.add(new Employee(11,"Vinod",20000022));
	 list.add(new Employee(55,"Hemant",200000));
	 list.add(new Employee(11,"Prashant",4444444));
	 list.add(new Employee(22,"Sahil",5555555));
	
	 Comparator<Employee> c = (e1, e2) -> (e1.getSalary() < e2.getSalary() )?1:(e1.getSalary() > e2.getSalary()) ?-1:0;
	 
	 Employee employee = list.stream().sorted(c).skip(1).findFirst().orElse(null);
	 
	 System.out.println(employee);
	}
	
	

}
