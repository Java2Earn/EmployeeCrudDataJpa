package com.pdw.packages;

 public class Welcome 
{
	 public  static int a=10;
	public  void m6()
	{
		System.out.println("Welcome");
	}
}
class Test
{
	public static void main(String[] args) 
	{
Welcome w=new Welcome();
	w.m6();	
System.out.println(Welcome.a);
	}

}
