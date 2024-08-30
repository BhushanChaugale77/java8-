package com.prowings.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator {

	
	
public static void main(String[] args) {
		
 		
	TreeSet t = new TreeSet(new MyComparator());
		
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ranulamma");
		
		
		
		
		System.out.println(t);
}	
	@Override
	public int compare(Object obj1, Object obj2) {
		
		String i1 =  obj1.toString();
		String i2 =  obj2.toString();
		
		
 
 	
//		return +1;        // [Roja, ShobhaRani, RajaKumari, GangaBhavani, Ranulamma]      Insertion order

 
			
//	    return -1;       // [Ranulamma, GangaBhavani, RajaKumari, ShobhaRani, Roja]       reverse of insertion order


			
//		return 0;       //   [Roja]    Only first element will be inserted & all remainning are considered as duplicate

		
//		return  i1.compareTo(i2);  // default natural sorting order [GangaBhavani, RajaKumari, Ranulamma, Roja, ShobhaRani]  Ascending order
		
//		return -i1.compareTo(i2);   // [ShobhaRani, Roja, Ranulamma, RajaKumari, GangaBhavani]  Descending Order

//		return i2.compareTo(i1);    // [ShobhaRani, Roja, Ranulamma, RajaKumari, GangaBhavani]  Descending Order
		
		return -i2.compareTo(i1);   // [GangaBhavani, RajaKumari, Ranulamma, Roja, ShobhaRani]      Ascending order
		
		
	}

}
