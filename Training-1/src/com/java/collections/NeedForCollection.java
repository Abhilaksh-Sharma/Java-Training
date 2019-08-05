package com.java.collections;

import java.util.Hashtable;
import java.util.Vector;
 
/* Need for Collection Framework :-
 * Before Collection Framework (or before JDK 1.2) was introduced, 
 * the standard methods for grouping Java objects (or collections) were
 *  Arrays or Vectors or Hashtables. 
 * All of these collections had no common interface.
 */
class NeedForCollection {
	public static void main(String[] args) {
		// Creating instances of array, vector and hashtable
		int arr[] = new int[] { 1, 2, 3, 4 };
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();
		v.addElement(1);
		v.addElement(2);
		h.put(1, "geeks");
		h.put(2, "4geeks");

		// Array instance creation requires [], while Vector and HashTable require ()
		// Vector element insertion requires addElement(), But
		//HashTable element insertion requires put()

		// Accessing first element of Array, Vector and HashTable
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

		// Array elements are accessed using [], vector elements
		// using elementAt() and hashtable elements using get()
	}
}
