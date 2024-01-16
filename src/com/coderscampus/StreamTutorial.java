package com.coderscampus;

import java.util.ArrayList;
import java.util.List;

public class StreamTutorial {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		populatePeopleData(people);
		
		
			// A Stream is a fancy, easier to read for loop.
		people.stream()		// Stream<List<Person>>
							// intermediary operations: filter, map, flatMap, distinct
			  .filter(person -> person.getSsn() > 10)	// gets John12 --> John20, removes the rest
			  .map(person -> person.getFirstName())		// this just gets the first name of the filtered data
			  .forEach(System.out::println);	// terminal: forEach, Collect, Reduce, Sum

	}

	private static void populatePeopleData(List<Person> people) {
		for (int i = 0; i < 20; i++) {
			Person person = new Person(i, "John" + (i + 1), "Doe" + (i + 1));
			people.add(person);
		}
		
	}

}
