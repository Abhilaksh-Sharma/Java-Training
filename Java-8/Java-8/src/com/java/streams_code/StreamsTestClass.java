package com.java.streams_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsTestClass {
	public static void main(String[] args) {
		
		//Evaluate Boolean Expression Result --> TRUE/FALSE
		Predicate<Integer> predicate = (s)->s==2;
		predicate.test(2);
		
		//Applying Transformation
		Function<String,String> function = (s)->s.substring(0,s.length()-3);
		function.apply("HelloWorld!");
		
		//Consume SERVICE --> Add items to List , Persist data to Database
		Consumer<Object> consumer = (obj)->obj.toString();
		consumer.accept("Object");
		
		//Supply SERVICE --> Fetch data from List , Database
		Supplier<Object> supplier = ()->"HelloWorld1";
		supplier.get();
		
		//STREAMS
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Table Tennis");
		gamesList.add("Badminton");
		gamesList.add("Basketball");
		gamesList.add("Cricket");
		gamesList.add("Sprint Race");
		gamesList.add("Kabbadi");
		gamesList.add("Golf");
		gamesList.add("Lawn Tennis");
		
		List<Integer> numbersList = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			numbersList.add(i);
		}
		
		//Ways of creating a STREAM Object
		Stream gamesStream = gamesList.stream();
		Stream numbersStrream = numbersList.stream();
		
		Stream.of(gamesList);
		Stream concatStream = Stream.of(gamesList,numbersList);
		
		/*
		 * Stream.Builder<List<Object>> streamBuilder = Stream.builder();
		 * streamBuilder.add(gamesList); streamBuilder.add(numbersList);
		 * Stream<List<Object>> stream = streamBuilder.build();
		 */
		
		//STREAM Methods
		
		
		System.out.print("\nForEach : \n");
		gamesList.parallelStream().forEach(g->System.out.println(g));
		
		System.out.print("\nForEachOrdered : \n");
		gamesList.parallelStream().forEachOrdered(g->System.out.println(g));
		
		boolean output = false;
		
		output = gamesList.parallelStream().peek(g->System.out.println(g)).map(s->s.toLowerCase()).allMatch(s->s.startsWith("b"));
		output = gamesList.parallelStream().peek(g->System.out.println(g)).map(s->s.toLowerCase()).anyMatch(s->s.startsWith("t"));
		output = gamesList.parallelStream().peek(g->System.out.println(g)).map(s->s.toLowerCase()).noneMatch(s->s.startsWith("x"));
		
		Optional<String> optional = gamesList.stream().map(string->string.substring(0, string.length()-3>=0?string.length()-3:string.length()).concat("-Modified*(~Me)")).findAny();
		
		long wordsEndingWithL = gamesList.stream().filter(words->words.toLowerCase().endsWith("l")).distinct().count();
		System.out.println("Count Implementation : " + wordsEndingWithL);
		
		long wordsEndingWithSpaces = gamesList.stream().filter(words->words.replaceAll("\\s+", " ").contains(" ")).distinct().count();
		System.out.println("Count Implementation : " + wordsEndingWithSpaces);
		
		//Streams Display using Iterator
		Iterator itr = gamesList.stream().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Optional<String> findFirst = gamesList.stream().filter(word->word.startsWith("B")).findFirst();
		findFirst.ifPresent(word->System.out.println("Find First & If Present(Optional) Implementation : " + word));
		
		//Display SORTED List of GAMES
		System.out.println("\nGAMES List : ");
		gamesList.stream().sorted().forEach(word->System.out.println(word));
		
		numbersList.stream().reduce((a, b) -> a + b)
				 .map(a->a*a) .ifPresent(display->System.out.println("Sum of Numbers ^ 2 : " + display));
		
		
		Optional<String> optionalvalue = Optional.of("HelloWorld");
		
		Stream.of(new String("helloWorld").toCharArray());
		
		//Check for Null values
		if(null!=Optional.ofNullable(optional)) {
			if(optional.isPresent())
				System.out.println("Find Any Implementation : " + optional.toString());
		}
		
		
		
		System.out.println("Output : " + output);
		
		
		
		List<String> listCheck = new ArrayList<String>();
		listCheck.add("CAR");
		listCheck.add("BIKE");
		listCheck.add("PLANE");
		listCheck.add("VAN");
		listCheck.add("AEROPLANE");
		
		Stream<String> streamCheck = listCheck.stream();
		Stream<List<String>> streamCheck2 = Stream.of(listCheck);
		
		listCheck.add("ACTIVA");
		
		System.out.println("\nChecking for Concuurent modification for STREAMS :- \n");
		//streamCheck.filter(str->str.length()>3).forEach(str->System.out.println(str));
		
		
		
		
		streamCheck2.flatMap(map->map.stream()).filter(str->str.length()>3).forEach(str->System.out.println(str));
		
		
		
		
		
		
		
	}
}
