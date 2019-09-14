package com.ControlStatements;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int n = sc.nextInt();	
		for (int i=1;i<n;i++)//100   ==>i<100 
		{ 
			int c = 1;    
			for (int j = 2; j < i; j++)//2<1
				{
				if (i % j == 0)//1%2==0 2
				{
					c = 0;
				}
			}
			if(c == 1)
				System.out.println(i);
		}
	}
}
