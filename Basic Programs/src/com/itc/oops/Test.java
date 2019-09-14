package com.itc.oops;
class A
	{
	void m1()
	{
		System.out.println("A class m1 method");
	}
	A()
	{
		System.out.println("default construcctor");
	}
	A(int a,int b)
	{
		System.out.println("param-construcctor "+(a+b));
	}
	}
public class Test 
{
	public static void main(String[] args) 
	{
		A a1=new A();
	A a=new A(12,13);
	a.m1();
	}
}
