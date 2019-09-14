package com.encapsulation;
class A
{
public void sum(int a,int b)
{
	System.out.println("the addition of two number is : "+(a+b));
}
public int sum(int a,int b,int c)
{
	return a+b+c;
}
}
public class Overload 
{
	public static void main(String[] args) 
	{
		A a=new A();
		int b = a.sum(1,2,3);
		a.sum(1,2);
		System.out.println(b);
	}
}
/*Parameter types
Number of parameters
Order of the parameters declared in the method*/