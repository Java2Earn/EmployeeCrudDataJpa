package com.lamdaExpressions;

interface A1 {
	int add(int a, int b);
}

public class MethodReferenceEx {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		A1 a2 = MethodReferenceEx::sum;
		System.out.println(a2.add(123, 12));
	}
}
