package com.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx 
{
	public static void main(String[] args) 
	{
	//in all set implementations duplicates  are not allowed  
	//insertion  order not preserved 
		
		Set s=new HashSet();
		s.add(12);
		s.add(1);
		s.add(10);
		s.add(2);
		s.add(3);
		s.add(7);
		s.add(5);
		s.add(4);
		s.add("ss");
		s.add(" ");
		System.out.println(s);		
		//duplicates  not allowed  
		//insertion  order  preserved 
		LinkedHashSet s1=new LinkedHashSet();
           s1.add("hello");
           s1.add("hai");
           s1.add("sa");
		System.out.println(s1);		
		//only tree set and tree map are allows homogeneous 
		//sorting order
		Set s2=new TreeSet();
		//s2.add("sai");		
		s2.add(1);
		s2.add(1);
		s2.add(2);
		s2.add(0);		
		System.out.println(s2);
	}
}
