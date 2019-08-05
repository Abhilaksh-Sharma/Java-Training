package com.java.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");

		// Traversing elements
		System.out.print("TreeSet Traversal : ");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\nInitial Set: " + set);

		System.out.println("Reverse Set: " + set.descendingSet());

		System.out.println("Head Set: " + set.headSet("C", true));

		System.out.println("SubSet: " + set.subSet("A", false, "E", true));

		System.out.println("TailSet: " + set.tailSet("C", false));
	}

}
