package com;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number for division");
	int fnum=sc.nextInt();
	System.out.println("Enter secoond number for division");
	int snum=sc.nextInt();
	try{
	int division=fnum/snum;
	System.out.println("division of two numbers is :"+division);
	}catch(ArithmeticException exception)
	{
		System.out.println("dont enter zero as denominator");
	}
	System.out.println("1000 lines of code");
}
}
