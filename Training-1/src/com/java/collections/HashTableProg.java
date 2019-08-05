package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableProg {

	public static void main(String[] arg) {
		// Creating a Hashtable
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

		// Insert elements into hashtable
		h.put(3, "Geeks");
		h.put(2, "forGeeks");
		h.put(1, "isBest");

		// Traversal using Enumeration
		System.out.print("Traversal using Enumeration : ");
		Enumeration<String> enumeration = h.elements();
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");
		}

		// Create a Clone or Shallow Copy of hashtable h
		h1 = (Hashtable<Integer, String>) h.clone();

		// checking clone h1
		System.out.println("\nValues in clone : " + h1);

		// Clear hashtable h
		h.clear();

		// Display Empty hashtable
		System.out.println("HashSet after clear() operation : " + h);
	}

}
