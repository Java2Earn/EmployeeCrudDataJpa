package com.methods;
public class Ex2 
{
	int a=10;
	int b=20;
public void clref(Ex2 e) 
{
	e.a=100;
	e.b=200;
}
	public static void main(String[] args) 
	{
		Ex2 e1=new Ex2();
		System.out.println(e1.a+"before"+e1.b);
		e1.clref(e1);
		System.out.println(e1.a+"after"+e1.b);	
	}
}
