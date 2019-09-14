package com.Collections;
import java.util.*;
public class ListEx 
{
public static void main(String[] args) 
{
	Vector l=new Vector();
	l.add("s");
	l.add(12);
	l.add(12);
	l.add("b");
	l.add(3,"wel");
	System.out.println(l.capacity());
	System.out.println(l.size());
	System.out.println(l);
	System.out.println(l.indexOf(12));
	System.out.println(l.lastIndexOf(12));
}
}
