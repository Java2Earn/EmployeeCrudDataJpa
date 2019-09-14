package com.ControlStatements;

import java.util.Scanner;

public class FibonacciSum
{
	public static void main(String[] args)
	{	
	int z=0,y=1,a=-1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n values");
	
	int n=sc.nextInt();

	int sum=0;
	  for(int i=1;i<=n;i++)
	  {
		  
		z=a+y;
		System.out.println(z);
		sum=sum+z;
		a=y;
		y=z;
		
	  }
	  System.out.println("sum="+sum);
	}
}
