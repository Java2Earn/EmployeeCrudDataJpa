package com.specifiers;

//public,private,protected,default
 class A
{
	protected int a=10;
	void m1()
	{
		System.out.println(a);
	}
	}

public class Test extends A
{
public static void main(String[] args) 
{
	Test t=new Test();
	System.out.println(t.a);
	
}
}
