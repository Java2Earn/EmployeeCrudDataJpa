package com.Collections1;
import java.util.WeakHashMap;
public class WeakHashMapEx1 
{
	public static void main(String[] args) 
	{
		WeakHashMap hm=new WeakHashMap();
		Temp t=new Temp();
		hm.put(t,"sandeep");
		System.out.println(hm);
		t=null;
		System.gc();
		System.out.println(hm);
	}
}
class Temp
{
	public String toString()
	{
		return "welcome";
	}
	
}
