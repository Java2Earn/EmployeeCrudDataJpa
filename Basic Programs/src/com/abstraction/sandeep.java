package com.abstraction;
class A
{
void m3()
{
	System.out.println("1000 lines ");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("2000 lines ");
		}
}
	public class sandeep 
	{
		public static void main(String[] args) 
		{
			B b=new B();
			b.m3();
			b.m2();
		}
	}