package com.Collections1;
import java.util.IdentityHashMap;
public class IdentityHasMapEx 
{
	public static void main(String[] args) 
	{
		IdentityHashMap i=new IdentityHashMap();//.equals//==

		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		i.put(i1,"sandeep");//10
		i.put(i2,"srikanth");//10
		System.out.println(i);
		
		

		

	/*String a="wel";
		String b="wel";
		
		i.put(a,"sandeep");//10
		i.put(b,"srikanth");//10
		System.out.println(i);*/
	}
}
