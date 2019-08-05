package com.java.forEach_code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyForEachCodeClass {

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Table Tennis");
		gamesList.add("Badminton");
		gamesList.add("Basketball");

		List<String> result = gamesList.stream().filter((s) -> s.startsWith("B")).map((s) -> s.concat("01"))
				.collect(Collectors.toList());

		result.forEach((s) -> System.out.println(s));

		result.stream().forEach((s) -> System.out.println(s));

		// For-Each 
		System.out.println("------------Iterating by passing lambda expression(For-Each)---------------");
		gamesList.stream().forEach(games -> System.out.println(games));
		System.out.println("------------Iterating by passing method reference(For-Each---------------");
		gamesList.stream().forEach(System.out::println);

		// For-EachOrdered --> Maintains order specified by the input stream source
		System.out.println("------------Iterating by passing lambda expression(For-EachOrdered)---------------");
		gamesList.stream().forEachOrdered(games -> System.out.println(games));
		System.out.println("------------Iterating by passing method reference(For-EachOrdered)---------------");
		gamesList.stream().forEachOrdered(System.out::println);

	}

}

class A {
	void method1() {
		System.out.println("Class A");
	}
}

interface B {
	default void method1() {
		System.out.println("Class B");
	}
}
