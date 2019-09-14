package com.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class  TreeSetWithComparator 
{
	public static void main(String[] args) 
	{
	TreeSet ts=new TreeSet(new MyComparator2());
	ts.add("suresh");
	ts.add("akash");
	ts.add("kishor");
	ts.add("raj");
		System.out.println(ts);
	}
}
class MyComparator2 implements Comparator
{
	public int compare(Object o1, Object o2) {
	String s1=(String) o1;
	String  s2=o2.toString();
	
//	return s1.compareTo(s2);//(alphabetical order)
	
return s2.compareTo(s1);
	
	//return -s1.compareTo(s2); //-(alphabetical order)=reverse of alphabets
	
	}

}
