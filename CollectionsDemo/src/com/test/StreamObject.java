package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		String str[] = { "Avinash", "Mayuri", "Ankita", "Sachin" };

		Stream<String> stream2 = Arrays.stream(str);
		stream2.filter(e -> e.startsWith("A")).forEach(System.out::println);
		System.out.println();
		Stream<String> stream3 = Stream.of(str);
		stream3.forEach(e -> {
			System.out.println(e);
		});

		IntStream stream4 = Arrays.stream(new int[] { 25, 30, 20, 45, 5 });
		stream4.forEach(e -> {
			System.out.println(e);
		});
	}
}
