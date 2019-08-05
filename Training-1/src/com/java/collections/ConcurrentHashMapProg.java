package com.java.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class ConcurrentHashMapProg {

	public static void main(String[] args) {
		// Creating a ConcurrentHashMap
		HashMap<String,String> hashmap = null;
		LinkedHashMap<String,String> linkedhasmap = null;
		TreeMap<String,String> treemap;
		HashSet<String> hashset = null;
		LinkedHashSet<String> linkedhashset = null;
		TreeSet<String> treeset = null;
		
		Hashtable<String,String> hashtable = new Hashtable<String,String>();
		hashtable.put(null, ""); //Gives RTE --> NullPointerException if key is provided to be null
		//hashtable.put("", null); //Gives RTE --> NullPointerException if key is provided to be null
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

		// Adding elements to map

		map.put("ONE", 1);

		map.put("TWO", 2);

		map.put("THREE", 3);

		map.put("FOUR", 4);

		// Getting an Iterator from map

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();

			System.out.println(key + " : " + map.get(key));

			map.put("FIVE", 5); // This will not be reflected in the Iterator
		}
		
		System.out.println("Map Size : " + map.size());
		
		Iterator<String> it2 = map.keySet().iterator();
		while (it2.hasNext()) {
			String key = (String) it2.next();

			System.out.println(key + " : " + map.get(key));

			//map.put("FIVE", 5); // This will not be reflected in the Iterator
		}
		

		
		
		
		
	}

}
