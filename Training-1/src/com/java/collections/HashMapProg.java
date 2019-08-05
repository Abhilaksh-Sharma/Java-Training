package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProg {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		// Check for empty
		print(map);

		// Insert elements into hashmap ("key" : "value")
		map.put("Vishal", 10);
		map.put("Sachin", 30);
		map.put("vaibhav", 20);

		// Map Traversal
		System.out.println("Map Traversal : ");
		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> me : set)
			System.out.println("{ Key : " + me.getKey() + " , Value : Rs." + me.getValue() + "}");

		// Display hashmap
		System.out.println("Size of map is:- " + map.size());

		print(map);

		// Print value if key exists
		if (map.containsKey("Vishal")) {
			Integer a = map.get("vishal");
			System.out.println("Value for key \"vishal\" is:- " + a);
		}

		// Clear hashmap elements
		map.clear();

		// Print hashmap
		print(map);

	}

	public static void print(Map<String, Integer> map) {
		if (map.isEmpty()) {
			System.out.println("Hashmap : " + "Map is Empty!");
		}

		else {
			System.out.println("Hashmap : " + map);
		}
	}

}
