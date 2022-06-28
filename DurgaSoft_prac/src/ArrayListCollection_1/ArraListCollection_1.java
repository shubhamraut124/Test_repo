package ArrayListCollection_1;

import java.util.*;

/*
 * here we are adding the 3 values using the add method 
 * some of inserted values are duplicate
 * we user insertes the value on same index compiler shifts the values to bigger index and inserts the new value on same index 
 * insertion order is preserved 
 * null value is accepted in the arraylist
 * heterogenous object are injected ie. string as well as integer 
*/
public class ArraListCollection_1 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList<>();
		
		al.add(0,"Shubham");
		al.add(1,"Shubham");
		al.add(0,"a");
		al.add(null);
		al.add(2);
		
		al.remove(1);
		System.out.println("Applyig itrator in array list");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Object x=itr.next();
			
			System.out.println(" "+x);
			
			
			
		}
		
	}
}
