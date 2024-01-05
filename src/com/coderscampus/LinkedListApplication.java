package com.coderscampus;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<>();		// LinkedList is easier to remove objects
		
		// LinkedList
		// Head = 1		 Head = 0 	    Head = 0	  Head = 0
		// Tail = 1  <-> Tail = 0  <->  Tail = 0  <-> Tail = 1
		//  (10) 		 (20)			(30)		  (40)
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
				
		printLinkedListToConsole(numbers);
		
		numbers.remove(0);								// This removes by int index (location)
		printLinkedListToConsole(numbers);
		
		numbers.remove((Integer)30);					// This removes by object (have to specify type)
		printLinkedListToConsole(numbers);
	}
	public static void printLinkedListToConsole(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("");
}
}