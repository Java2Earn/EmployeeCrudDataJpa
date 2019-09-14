package com.packages;

class A
{
	int a;
	int b;
	
 void sum(int a,int b)
 {
	 System.out.println(a+b);
 }
 
 class B extends A
 {
	 int a;
	 int b;
	 void sub()
	 {
		 
	 }
	 
 }

}
public class ConstructorEx {

	public static void main(String[] args)
	{
		
		A a1 =new A();

		a1.sum(12,12);

	}

}
