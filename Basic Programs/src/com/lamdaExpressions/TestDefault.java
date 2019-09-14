package com.lamdaExpressions;

@FunctionalInterface
interface A {
	void m1();
	default void m2() {
		System.out.println("interface default method");
	}
default void m3() {
		System.out.println("interface default method");
	}}
public class TestDefault implements A {
	@Override
	public void m1() {
		System.out.println("TestDefault class method implementation");
	}
	@Override
	public void m2() {
		System.out
				.println("different implementation for interface default method");
	}
	public static void main(String[] args) {
		TestDefault td = new TestDefault();
		td.m1();
		td.m2();
		td.m3();
	}
}
