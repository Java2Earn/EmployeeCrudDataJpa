package com.Operaters;

public class BitwiseOperatorEx {
	 public static void main(String[] args) {
	  //Variables Definition and Initialization
	  int num1 = 30, num2 = 6, num3 =0;

	  //Bitwise AND Returns true if both arguments are true
	  System.out.println("num1 & num2 = " + (num1 & num2));//6
	  
	  //Bitwise OR returns true if atleast one argument is true
	  System.out.println("num1 | num2 = " + (num1 | num2) );//30
	  
	  //Bitwise XOR returns true if both arguments are different
	  System.out.println("num1 ^ num2 = " + (num1 ^ num2) );//24
	  
	  //Binary Complement Operator
	  System.out.println("~num1 = " + ~num1 );//    -31

	 }
	}
//Java program to illustrate 
//bitwise operators 
/*public class	BitwiseOperatorEx 
{ 
	public static void main(String[] args) 
	{ 
		//if int a = 010 java considers it as octal value of 8 as number starts with 0. 
		int a = 0x0005; 
		int b = 0x0007; 

		// bitwise and 
		// 0101 & 0111=0101 
		System.out.println("a&b = " + (a & b)); 

		// bitwise and 
		// 0101 | 0111=0111 
		System.out.println("a|b = " + (a | b)); 

		// bitwise xor 
		// 0101 ^ 0111=0010 
		System.out.println("a^b = " + (a ^ b)); 

		// bitwise and 
		// ~0101=1010 
		System.out.println("~a = " + ~a); 

		// can also be combined with 
		// assignment operator to provide shorthand 
		// assignment 
		// a=a&b 
		a &= b; 
		System.out.println("a= " + a); 
	} 
} 
*/