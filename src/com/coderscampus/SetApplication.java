package com.coderscampus;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApplication {
	
	// Set will not allow duplicates

	public static void main(String[] args) {
		
		Set<Person> people = new HashSet<>();
		
		people.add(new Person (111111111, "Trevor", "Page"));
		people.add(new Person (111111112, "Trevor2", "Page2"));
		
		for (Person person : people) {
			System.out.println(person);
		}
		
	//	example1();
	}

	public static void example1() {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();  // LinkedHashSet - stores in order
		
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		System.out.println(uniqueNumbers.add(4));
		System.out.println(uniqueNumbers.add(5));
		System.out.println(uniqueNumbers.add(6));
		System.out.println(uniqueNumbers.add(1));
		
		printSetToConsole(uniqueNumbers);
		
		Set<String> uniqueNames = new HashSet<>();			// HashSet - Doesn't store in order
		
		uniqueNames.add("Trevor Page");
		uniqueNames.add("Elon Musk");
		uniqueNames.add("Jane Doe");
		uniqueNames.add("Josh Someone");
		
		for (String element : uniqueNames) {
			System.out.println(element);
		}
	}
		
		private static void printSetToConsole(Set<Integer> elements) {
			for (Integer element : elements) {
				System.out.println(element);
			}
			System.out.println("");
		}
	}


