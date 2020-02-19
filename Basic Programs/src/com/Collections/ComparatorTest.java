package com.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());//comparabble-->compareto
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(21);
		System.out.println(t);
	}
}
 class MyComparator implements Comparator<Object>
{
	/*  return -ve if obj1 has to come before obj2
		return +ve if obj1 has to come after obj2
	 return 0 if obj1 & obj2 are equal.*/
	 
	 public int compare(Object o1, Object o2) {
			Integer i1=(Integer) o1;
			Integer i2=(Integer)o2;
			/*	if(i1<i2)
			return +1000;
			else if(i1>i2)
				return -10000;
			else
				return 0;	
			*/
			//return -i1.compareTo(i2);
			return i2.compareTo(i1);
		}
}

