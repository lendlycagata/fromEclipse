package appDeveloper;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
	
	public static void main(String args[]) {		      
	      ArrayList list = new ArrayList();		      
	      list.add("C");
	      list.add("A");
	      list.add("E");
	      
	      // iterator to the start of the collection by calling iterator( ) method.
	      Iterator it = list.iterator();
	      
	      // Set up a loop that makes a call to hasNext( ) and have the loop iterate
	      // as long as hasNext( ) returns true
	      while(it.hasNext()) {
	      
	      	 // obtain each element by calling next( )
	         Object element = it.next();
	         System.out.print("\n element: " + element);
	      }
	   }
	}
