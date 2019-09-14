package com.inheritance;
interface A1
{
	void m2();
	}
interface A2
{
	void m2();
	}
public class C1 implements A1,A2
{
	public static void main(String[] args) 
	{
	C1 c=new C1();
	c.m2();
	}	
	public void m2() {
		System.out.println("implemented");
	}
}
