package com.inheritance;

class L
{
	void m1()
	{
		System.out.println("am from L class ");
	}
	}
class M extends L
{
	void m2()
	{
		System.out.println("am from M class");
	}
	}
class N extends M
{
	void m3()
	{
		System.out.println("am from N class");
	}
	
	}
class O extends N
{
	void m4()
	{
		System.out.println("am from O class");
	}
}
public class HybridLevel extends M
{
	public static void main(String[] args) 
	{
	HybridLevel h=new HybridLevel();
	h.m1();
	h.m2();
		
	}
}
