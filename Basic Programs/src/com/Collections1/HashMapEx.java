package com.Collections1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapEx
{
public static void main(String[] args) 
{
HashMap<String,Integer> hm=new HashMap<String,Integer>();
hm.put("sandeep",100);///entry
System.out.println(hm);
Object o=hm.put("sandeep",2);
System.out.println(o);
System.out.println(hm);
hm.put("nayak",3);
hm.put("srikanth",4);
System.out.println(hm);
System.out.println(hm.size());
Object obj=hm.remove("srikanth");
System.out.println(obj);
System.out.println(hm);

Set<Entry<String,Integer>> s=hm.entrySet();

Iterator<Entry<String, Integer>> itr=s.iterator();

while(itr.hasNext())
{
	Entry<String, Integer> e=itr.next();
	System.out.print(e.getKey()+"  ");
	System.out.println(e.getValue());
}





















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