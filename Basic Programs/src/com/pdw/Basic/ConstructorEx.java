package com.pdw.Basic;
public class ConstructorEx {
	int a=10;
	int b=20;
	ConstructorEx()
	{
		System.out.println("Constructor called by JVM Automatically when ever we are creating the object of that particular class"+a);
	}
	public ConstructorEx(int a)
	{
		this.a=a;
		System.out.println("Constructor called by JVM Automatically when ever we are creating the object of that particular class"+a);
		
	}
	ConstructorEx(int a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{		
		ConstructorEx  obj=new ConstructorEx(3);
		ConstructorEx obj1=new ConstructorEx();
		ConstructorEx obj2=new ConstructorEx(1,1.1f);
	}

}
