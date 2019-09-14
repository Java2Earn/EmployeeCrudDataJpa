package com.inheritance;
class A
{
	void m1()
	{
		System.out.println("Am from A class");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Am from B class");
	}
}
class C extends B
{
	void m3()
	{
		System.out.println("Am from C class");
	}
	}
public class Inhertance2 
{
	public static void main(String[] args) 
	{
		C c=new C();
	      c.m1();
	      c.m3();
	      c.m2();
	}
}
