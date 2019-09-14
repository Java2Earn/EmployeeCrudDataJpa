package com.String;
/*
 * how to make java class as immutable 
 * 1)we need to make class as final.
 * 2)make instance variable as final 
 * 3)no setter methods for instance variables//only getters
 */
public final class ImmutableClass 
{
	private final int a;
	private final float b;
	
	public int getA() {
		return a;
	}
	public float getB() {
		return b;
	}
	public ImmutableClass(int a ,int b) 
	{
		this.a=a;
		this.b=b;		
	}
	public static void main(String[] args) 
	{
		
	}
}
