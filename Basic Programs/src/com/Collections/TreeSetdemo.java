package com.Collections;
import java.util.*;
class TreeSetdemo
{
public static void main(String[] args)
{
TreeSet ts = new TreeSet(new MyComparator1());
ts.add(10);
ts.add(13);
ts.add(9);
System.out.println("set:"+ts);
        }}
class MyComparator1 implements Comparator
{   public int compare(Object o1, Object o2)
	{
		Integer i1=(Integer) o1;//13
		Integer i2=(Integer) o2;//10
		//returns +ve =>obj1 has to come before obj2
		//returns -ve =>obj1 has to come after obj2
		//returns 0=>both objects are same 
	return -i1.compareTo(i2);
	//	return i2.compareTo(i1);
	/*		if(i1<i2)//13<10-->
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}*/
	}}

