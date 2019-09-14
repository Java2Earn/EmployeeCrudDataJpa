package com.ControlStatements;

public class ControlStatements {

	public static void main(String[] args) {
		/*int num=12;
		if(num%2==0)
		{
			System.out.println("the number is even number");		
		}
		else
		{
			
			System.out.println("the number is odd");
		}*/
		
		int a,b,c;
		a=3;
		b=2;
		c=4;
		if(a>b && b>c)
	
			System.out.println("a greater value");
		
		else if (a<b && b>c )
		{
			System.out.println("b greater value");
		}
		else
		{
			System.out.println("c is greater");		
		}
	}

}
