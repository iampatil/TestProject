package com.test.defaultmethod;

public class A implements Interface1 {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.addition(10, 10));
		a.display();
	}
}
