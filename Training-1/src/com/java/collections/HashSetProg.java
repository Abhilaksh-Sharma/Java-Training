package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetProg {

	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");

		System.out.println("An initial list of elements: " + set);

		// Traversing elements
		System.out.print("Iterating over HashSet :");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		// Removing specific element from HashSet
		set.remove("Ravi");
		System.out.println("\nAfter invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Updated List: " + set);

		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);

		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: " + set);

		// Removing all the elements available in the set
		set.clear();
		System.out.println("After invoking clear() method: " + set);

	}

}
