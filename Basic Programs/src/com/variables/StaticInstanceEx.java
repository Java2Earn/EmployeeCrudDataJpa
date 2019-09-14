package com.variables;

class Test
{
static int a=10;	
int b=20;
public void show()
{
	int a;
	int b;
System.out.println("instance method");	
}
public static void show1()
{
	int a;
	int b;
System.out.println("static method");	
}
}
public class StaticInstanceEx 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.b);
		System.out.println(Test.a);
		t.show();
		Test.show1();
		
		
	}

}
