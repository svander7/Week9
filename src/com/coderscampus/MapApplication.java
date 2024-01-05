package com.coderscampus;

import java.util.HashMap;
import java.util.Map;

public class MapApplication {
	
	public static void main(String[] args) {
		// Key = SSN
		// Value = Person's Name
		Map<Integer, String> people = new HashMap<>();
		
		// HashMaps store data a Key / Value pairs (K / V)
		// Key = uniquely identifies the data in the Value
		
		people.put(111111111, "Trevor Page");
		people.put(222222222, "Josh Someone");
		people.put(333333333, "Elon Musk");
		people.put(444444444, "Jane Doe");
		people.put(555555555, "Jeff Bezos");
		people.put(555555555, "John Doe");
		
		System.out.println("Get data using an invalid key: ");
		System.out.println(people.get(123456789));
		
		System.out.println("Get data using a valid key: ");
		System.out.println(people.get(111111111));
		
		System.out.println("Get data using a valid key: ");
		System.out.println(people.get(555555555));			// returns the latest input
		
		people.remove(555555555);
		System.out.println("Get data using a valid key: ");
		System.out.println(people.get(555555555));
	}
}
