package com.test;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();

		l.add(31);
		l.add(62);
		l.add(35);
		l.add(74);
		l.add(58);
		l.add(67);
		l.add(78);
		l.add(99);

		l.forEach(e -> System.out.println(e));
		
		List<Integer> newList = l.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> collect = l.stream().filter(e -> e > 50).collect(Collectors.toList());
		System.out.println(collect);
		
		l.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
		
	}
}
