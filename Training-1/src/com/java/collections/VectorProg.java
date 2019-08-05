package com.java.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorProg {
	public static void main(String args[]) {
		// Create an empty Vector
		Vector<Integer> in = new Vector<>();
		// Add elements in the Vector
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(200);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);
		// Display the Vector elements
		System.out.println("Values in vector: " + in);

		// Use remove() method to delete the first occurence of an element
		System.out.println("Remove first occourence of element 200: " + in.remove((Integer) 200));

		// Display the vector elements after remove() method
		System.out.println("Values in vector: " + in);

		// Remove the element at index 4
		System.out.println("Remove element at index 4: " + in.remove(4));
		System.out.println("New Value list in vector: " + in);

		// Remove an element
		in.removeElementAt(5);

		// Checking vector and displays the element
		System.out.println("Vector element after removal at index 5: " + in);

		// Get the hash code for this vector
		System.out.println("Hash code of this vector = " + in.hashCode());

		// Get the element at specified index
		System.out.println("Element at index 1 is = " + in.get(1));

		// Display Elements of Vector using Enumeration
		System.out.print("\nItertaing Elements of Vector using Enumeration : ");
		Enumeration<Integer> enumeration = in.elements();
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");
		}

		// Display Elements of Vector using Enumeration
		System.out.print("\nItertaing Elements of Vector using Itertaor : ");
		Iterator<Integer> itr = in.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
