package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProg {

	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new LinkedHashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		System.out.println("Iterating Elements using Iterator : ");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
