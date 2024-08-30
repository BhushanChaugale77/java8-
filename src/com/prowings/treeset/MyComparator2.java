package com.prowings.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator2 implements Comparator {

	
	
public static void main(String[] args) {
		
 		
	TreeSet t = new TreeSet(new MyComparator2());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		
		
		System.out.println(t);
}	
	@Override
	public int compare(Object obj1, Object obj2) {
		
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		
		
 
 	
//		return +1;        // [10, 0, 15, 5, 20, 20]    Insertion order

 
			
//	    return -1;       //  [20, 20, 5, 15, 0, 10]    reverse of insertion order


			
 		return 0;       //   [10]    Only first element will be inserted & all remainning are considered as duplicate

		
//		return  i1.compareTo(i2);  // default natural sorting order [0,5,10,15,20] =Ascending order
		
//		return -i1.compareTo(i2);   // [20, 15, 10, 5, 0]   Descending Order

//		return i2.compareTo(i1);    // [20, 15, 10, 5, 0]   Descending Order
		
//		return -i2.compareTo(i1);   // [0,5,10,15,5,20]      Ascending order
		
		
	}

}
