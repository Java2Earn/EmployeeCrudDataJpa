package com.lamdaExpressions;

@FunctionalInterface
interface A {
	void m1();
	static void m2() {
		System.out.println("interface static method");
	}
default void m3() {
		System.out.println("interface default method");
	}}
public class TestDefault implements A {
	public static void main(String[] args) {
		TestDefault td = new TestDefault();
		td.m1();
		A.m2();
		td.m3();
	}
	@Override
	public void m1() {
	
	}
}
