package com.lamdaExpressions;
import java.util.Scanner;
@FunctionalInterface
interface Welcome {
	int lengthOfString(int name);
//	static+default
}
public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for square:");
		int num = sc.nextInt();
		Welcome wel =num1-> num1*num1;
		System.out.println(wel.lengthOfString(num));
	}}