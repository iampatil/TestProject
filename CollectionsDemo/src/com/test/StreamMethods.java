package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Avinash", "Mayuri", "Ankita", "Sachin");
		//1 way to print names starts with A
		names.stream().filter(e -> e.startsWith("A")).forEach(System.out::println);
		
		//2 way to print names starts with A
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> numbers = Arrays.asList(2, 6, 4, 3, 8, 7, 9, 5);
		List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		numbers.stream().sorted().forEach(System.out::println);
		
		Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println(integer);
		
		Integer integer1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println(integer1);
	}
}
