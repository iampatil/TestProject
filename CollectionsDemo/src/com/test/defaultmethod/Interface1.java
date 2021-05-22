package com.test.defaultmethod;

public interface Interface1 {

	default String display() {
		System.out.println("default method called");
		return "";
	}

	int addition(int a, int b);
	
	public static void method1() {
		System.out.println("static method called");
	}
}
