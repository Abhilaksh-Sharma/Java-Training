package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProg {
	public static void main(String[] args) {
		// size of ArrayList
		int n = 5;

		// declaring ArrayList with initial size n
		List<Integer> list = new ArrayList<Integer>();

		// Appending the new element at the end of the list
		for (int i = 1; i <= n; i++)
			list.add(i);

		// Printing elements
		System.out.println("ArrayList: " + list);

		// Remove element at index 3
		list.remove(3);

		// Displaying ArrayList after deletion
		System.out.println("ArrayList after deletion : " + list);

		System.out.print("ArrayList iterated by simple for loop : ");
		// Printing elements one by one
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		System.out.print("\nArrayList iterated by Iterator : ");
		// Getting Iterator
		Iterator itr = list.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.print("\nArrayList iterated by for-each loop : ");
		// Traversing list through for-each loop
		for (Integer num : list)
			System.out.print(num + " ");

		// Create a collection from already existing collection
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.addAll(list);

		System.out.print("\n\nNew ArrayList iterated by simple for loop : ");
		// Printing elements one by one
		for (int i = 0; i < arrList.size(); i++)
			System.out.print(arrList.get(i) + " ");

		// Retain-All Elements example
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.retainAll(al2);
		
		System.out.print("\nIterating Elements after retaining the Elements of ArrayList al2 : ");
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}

	}

}
