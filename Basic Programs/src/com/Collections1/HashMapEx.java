package com.Collections1;
import java.util.TreeMap;
public class HashMapEx
{
public static void main(String[] args) 
{
	TreeMap hm=new TreeMap();
		hm.put(129,"suresh");
		hm.put(198,"naresh");
		hm.put(125,"suresh");
		hm.put(126,"ramesh");
		hm.put(127,"rajesh");
		hm.put(128,"yogesh");
	System.out.println(hm);
	
	
/*
Set<Entry<String,Integer>> s=hm.entrySet();8
Iterator<Entry<String, Integer>> itr=s.iterator();

while(itr.hasNext())
{
	Entry<String, Integer> e=itr.next();
	System.out.print(e.getKey()+"  ");
	System.out.println(e.getValue());
}*/





















/*Set s=hm.keySet();
System.out.println(s);
Collection c=hm.values();
System.out.println(c);
Set s1=hm.entrySet();
System.out.println(s1);
Iterator itr=s1.iterator();
while(itr.hasNext())
{//System.out.println(itr.next());
Map.Entry e= (Map.Entry)itr.next();
System.out.println(e.getKey());
System.out.println(e.getValue());
	}*/
}
}