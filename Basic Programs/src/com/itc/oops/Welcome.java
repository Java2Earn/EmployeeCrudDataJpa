package com.itc.oops;

 class Test2
{
int a=20;
	public void properties()
	{
		a=++a;
		System.out.println("100 crores  "+a);
	}
	 public void gf()
	{
		System.out.println("xyz");
	}
}
public class Welcome extends Test2
{
	public void gf()
	{
		System.out.println("abc");
	}
	public static void main(String[] args) 
	{
		Welcome w=new Welcome();
		w.properties();
		w.gf();
	}
}
