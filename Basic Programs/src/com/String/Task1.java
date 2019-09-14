package com.String;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your String");
		String s=sc.next();
		System.out.println("Enter the your index");
		int i=sc.nextInt();
		System.out.println("Your required char:  "+s.charAt(i));
		
	}
}
