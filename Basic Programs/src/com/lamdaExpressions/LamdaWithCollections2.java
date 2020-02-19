package com.lamdaExpressions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LamdaWithCollections2 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> ae=new  HashMap<Integer,String>();
		ae.put(23,"suresh");
		ae.put(13,"suresh");
		ae.put(43,"suresh");
		ae.put(22,"suresh");
		ae.put(26,"suresh");
		ae.put(20,"suresh");
		System.out.println(ae);
			Set<Entry<Integer, String>> set=ae.entrySet();	
		set.stream().forEach(System.out::println);
	}
}
