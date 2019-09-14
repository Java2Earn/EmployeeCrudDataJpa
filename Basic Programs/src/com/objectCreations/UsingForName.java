package com.objectCreations;
//Using Class.forName()
//If we know the name of the class & 
//if it has a public default constructor we can create an object in this way.
class Test
{
	public Test() {
		System.out.println("welcome to object creations");
	}
void m1()
{
	System.out.println("welcome to object creations");	
}
}
public class UsingForName extends Test implements Cloneable{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException 
	{
	
	Object us=Class.forName("com.objectCreations.UsingForName").newInstance();
	UsingForName us1=(UsingForName) us;
	us1.m1();
	
	UsingForName us2=(UsingForName) us1.clone();
	
	us2.m1();
	
	}
}
