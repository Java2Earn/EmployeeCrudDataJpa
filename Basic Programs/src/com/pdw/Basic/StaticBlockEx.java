package com.pdw.Basic;

public class StaticBlockEx 
{	
	public static void main(String[] args) {
		System.out.println("hello world from main");
		main(10);
	}
	public static void main(int a)
	{
		System.out.println("overloaded method");
	}
	
	
}
