package com.Exceptions;

public class Exception_Handling {
	public static void main(String args[]) {
		try {
			throw new ArithmeticException("Hello");
			//System.out.print("A");
		} catch (ArithmeticException e) {
			System.out.print(e);
		}
	}
}