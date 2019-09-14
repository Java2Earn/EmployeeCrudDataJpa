package com.Collections1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test 
{
	public static void main(String[] args) 
	{
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(1, "suresh");
	m.put(2, "naresh");
	m.put(3, "ramesh");
	m.put(4, "rajesh");
	System.out.println(m);
	
	Set<Entry<Integer, String>> set=m.entrySet();
	Iterator<Entry<Integer, String>> itr=set.iterator();
	while(itr.hasNext())
	{
		Entry entry=itr.next();
		entry.getValue();
	}
	
	
	
	
	}
}
