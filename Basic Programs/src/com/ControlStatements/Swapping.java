package com.ControlStatements;

public class Swapping {

	public static void main(String[] args)
	{
	
		/*int a=4;
	int b=5;
	
	int c=a;
	
	a=b;
	b=c;
	System.out.println("a vlaue is"+a);
	System.out.println("a vlaue is"+b);
	*/

	
		/*int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
		*/
		
		int a=5;//100
		int b=4;//101
		
         a=a^b; //100^101==>001
         b=a^b; //001^101==>100
         a=a^b; //001^100==>101
     	System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
         
       
		
		
	}
}
