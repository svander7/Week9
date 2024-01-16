package com.coderscampus;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApplication {

	public static void main(String[] args) {
		
//		example3();
		example2();
//		example1();
	}

	public static void example3() {
		List<List<Integer>> listOfNumbersList = new ArrayList<>();
		listOfNumbersList.add(Arrays.asList(1,2,3));
		listOfNumbersList.add(Arrays.asList(2,3,4));
		listOfNumbersList.add(Arrays.asList(3,4,5));
		listOfNumbersList.add(Arrays.asList(4,5,6));
		
		
		IntSummaryStatistics sumStats = listOfNumbersList.stream()
						 					 			 .flatMap(x -> x.stream())
						 					 			 .mapToInt(Integer::intValue)
						 					 	// same as line above
//						 					 			 .mapToInt(x -> x.intValue())
						 					 			 .summaryStatistics();
		
		System.out.println("Average: " + sumStats.getAverage());
		System.out.println("Max: " + sumStats.getMax());
		System.out.println("Min: " + sumStats.getMin());
		System.out.println("Count: " + sumStats.getCount());
	}

	public static void example2() {
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "F150", 2017));
		cars.add(new Car("Toyota", "Corolla", 1997));
		cars.add(new Car("Toyota", "Celica", 2002));
		
		Map<String, List<Car>> groupedByBrand = cars.stream()
			.collect(Collectors.groupingBy((car) -> car.getBrand()));
		
		System.out.println(groupedByBrand);
		
		Set<Entry<String,List<Car>>> entrySet = groupedByBrand.entrySet();
		
		System.out.println(entrySet);
		
		entrySet.stream()
				.forEach((entry) -> {
					System.out.println(entry.getKey() + " -> " + entry.getValue());
				});
		
//		List<String> models = cars.stream()
//								  .map(car -> car.getModel())
//								  .collect(Collectors.toList());
//		
//		String brands = cars.stream()
//				            .map(car -> car.getBrand())
//				            .distinct()
//				            .filter(brand -> brand.startsWith("T"))
//							.collect(Collectors.joining(", "));
//		
//		models.stream()
//			  .forEach(model -> System.out.println(model));
//		System.out.println("- - - - - - - -");
//		System.out.println(brands);
	}

	public static void example1() {
		List<String> names = new ArrayList<>();
		
		populateNames(names);
		
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		names.stream()
			 .forEach(name -> System.out.println(name));
	}
	
	private static void populateNames(List<String> names) {
		names.add("Nahla Kirkland");
		names.add("Charly Gay");
		names.add("Jamie-Lee Swan");
		names.add("George Mckeown");
		names.add("Deen Markham");
		names.add("Misha Ali");
		names.add("Tanya James");
		names.add("Taybah Wilkinson");
		names.add("Zac Holman");
		names.add("Kacie Dunlap");
	}

}
