package com.inheritance;

class X
{
	void m1()
	{
		System.out.println("i am from X class");
	}
}
class Y extends X
{
	void m2()
	{
		System.out.println("i am from Y class");
	}
	}
class Z extends Y
{
	void m3()
	{
		System.out.println("i am from Z class");
	}
}
public class MultiLevel  {

	public static void main(String[] args) 
	{
		Z z=new Z();
		z.m1();
		z.m2();
		z.m3();
		
	}

}
