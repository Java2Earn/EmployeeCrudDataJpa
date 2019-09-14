package com.Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorTest 
{
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("sunil");
	al.add("sandeep");
	al.add("sandeep");
	al.add("suresh");
	al.add("sandeep");
	al.add("kiran");
	al.add("kiran");
	al.add("sandeep");
	System.out.println(al); 
	
Iterator itr1=al.iterator();
	while(itr1.hasNext())
	{
		String name=(String) itr1.next();//sunil
		if(name.equals("sandeep"))
		{
			itr1.remove();
		}else{
			System.out.println(name);
		}
	}
}
}
