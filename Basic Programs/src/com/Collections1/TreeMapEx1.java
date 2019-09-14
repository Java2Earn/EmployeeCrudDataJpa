package com.Collections1;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapEx1 
{
	public static void main(String[] args) 
	{
		TreeMap tr=new TreeMap(new MyComp());
		tr.put('x',1);
		tr.put('a',4);
		tr.put('y',3);
		tr.put('l',2);
		System.out.println(tr);
		Set s1=tr.keySet();
		
		Iterator i=s1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	Set s=	tr.entrySet();
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
	Entry e=	(Entry) itr.next();
	System.out.println(e.getKey()+" "+e.getValue());
	}
	
	
	
		
	}
}
class MyComp implements Comparator
{
	public int compare(Object arg0, Object arg1) 
	{
		String s1=arg0.toString();
		String s2=arg1.toString();
		return s2.compareTo(s1);
	}
}