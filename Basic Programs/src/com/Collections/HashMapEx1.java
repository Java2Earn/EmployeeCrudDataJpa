package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx1 
{
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	
	hm.put(1239,"qwerty1");
	hm.put(1290,"qwerty2");
	hm.put(1253,"qwerty2");
	hm.put(1262,"qwerty4");
	System.out.println(hm);

	
	Set set=hm.keySet();
	
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
	
	//System.out.println(entry.getValue());
	
	
	System.out.println(itr.next());	
	}
	
	
}
	
	
	
	
}
