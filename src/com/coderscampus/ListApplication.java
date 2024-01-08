package com.coderscampus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Trevor Page");
		names.add("John Doe");
		names.add("Jane Doe");
		names.add("Elon Musk");
		names.add("Josh Someone");
		
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return 02.compareTo(01)
				
			}
		});
		
		printArrayListToConsole(names);
		
//		example1();
	}

	protected static void compareTo(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void example1() {
		String[] names = new String[4];
		
		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "John Doe";
		names[3] = "Elon Musk";
		
		names[1] = null;
		
		System.out.println("Arrays Example:");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("- - - - - - - -");
		System.out.println("");
		
		// Collections -> Java solution to common data structure problems
		// List (type of Collection)   List<String> name of list = new ArrayList<String>();    Used Most
		// Set (type of Collection)
		// Map (type of Collection)
		
		List<String> elements = new ArrayList<String>();
		elements.add("Trevor Page");
		elements.add("John Doe");
		elements.add("Jane Doe");
		elements.add("Elon Musk");
		elements.add("Josh Someone");
		
		System.out.println("List Example:");
		printArrayListToConsole(elements);
		
		elements.remove(1);  				// This is remove int index
		printArrayListToConsole(elements);
		
		elements.remove("Josh Someone");  	// This is remove object o
		printArrayListToConsole(elements);
	} 

	private static void printArrayListToConsole(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}

}
