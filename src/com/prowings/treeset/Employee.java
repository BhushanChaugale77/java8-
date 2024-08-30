package com.prowings.treeset;

import java.util.TreeSet;

public class Employee implements Comparable {

	String name;
	int eid;
	
	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}

	
	@Override
	public int compareTo(Object obj) {
		
		
		 if (obj instanceof Employee) {
		        Employee otherEmployee = (Employee) obj;
		        return this.name.compareTo(otherEmployee.name);
		    } else {
		        throw new ClassCastException("Cannot compare Employee with " + obj.getClass().getName());
		    }

//Default natural Sorting order t:- [Employee [name=balaih, eid=200], Employee [name=chiru, eid=50], Employee [name=nag, eid=100], Employee [name=venki, eid=100]]

 
//		int eid1 = this.eid;
//		Employee e =(Employee)obj;
//		int eid2 = e.eid;
//		
//		if (eid1 < eid2)
//		{
//			return -1;
//		}
//		
//		else if (eid1 > eid2)
//		{
//			return +1;
//		}
//		else
//		return 0;
	}

//Default natural Sorting order t:- [Employee [name=chiru, eid=50], Employee [name=nag, eid=100], Employee [name=balaih, eid=200]]
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("nag", 100);
		Employee e2 = new Employee("balaih", 200);
		Employee e3 = new Employee("chiru", 50);
		Employee e4 = new Employee("venki", 100);
		Employee e5 = new Employee("nag", 100);
		
		TreeSet t = new TreeSet();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println("Default natural Sorting order t:- "+t);
		
		TreeSet t1 = new TreeSet(new Comparator());
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		 
		System.out.println("Customized Sorting order t1:- "+t1);
		
//Customized Sorting order t1:- [Employee [name=balaih, eid=200], Employee [name=chiru, eid=50], Employee [name=nag, eid=100], Employee [name=venki, eid=100]]
//Customized Sorting order t1:- [Employee [name=balaih, eid=200], Employee [name=chiru, eid=50], Employee [name=nag, eid=100], Employee [name=venki, eid=100]]
	}
	

}
