package com.test.defaultmethod;

public class B implements Interface1 {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.addition(10, 10));
	}
}
