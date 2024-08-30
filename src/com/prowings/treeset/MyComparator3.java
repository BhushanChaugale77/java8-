package com.prowings.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator3 implements Comparator {

	
	
public static void main(String[] args) {
		
 		
	TreeSet t = new TreeSet(new MyComparator3());
		
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));                  // if we go our own sorting order by comparator then objects need not be comprable 
		t.add(new StringBuilder("xx"));                //  & homogeneous i.e we can add hetrogeneous & non comparable objects also
		t.add("ABCD");
		t.add("A");
		
		
		
		System.out.println(t);
}	
	@Override
	public int compare(Object obj1, Object obj2) {
		
		 String s1 = obj1.toString();
		 String s2 = obj2.toString();
		
		
 
 	
//		return +1;        // [A, ABC, AA, xx, ABCD, A]    Insertion order

 
			
//	    return -1;       //  [A, ABCD, xx, AA, ABC, A]    reverse of insertion order


			
//		return 0;       //  [A]    Only first element will be inserted & all remainning are considered as duplicate

		
//		return  s1.compareTo(s2);  // default natural sorting order [A, AA, ABC, ABCD, xx]  Ascending order
		
//		return -s1.compareTo(s2);   // [xx, ABCD, ABC, AA, A]   Descending Order

//		return s2.compareTo(s1);    // [xx, ABCD, ABC, AA, A]   Descending Order
		
		return -s2.compareTo(s1);   // [A, AA, ABC, ABCD, xx]     Ascending order
		
		
	}

}
