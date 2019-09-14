package com.pdw.Basic;

 class Test123
{
	 int a;
	public void syso() 
	{	
System.out.println(" Am from Test class"+a);
	}
}
public class InstantiationsEs 
{
	public static void main(String[] args) 
	{
		Test123 obj=new Test123();
		obj.a=1;
		obj.syso();
	}
}
