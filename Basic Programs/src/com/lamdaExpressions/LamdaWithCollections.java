package com.lamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaWithCollections {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ae=new  ArrayList<Integer>();
		ae.add(23);
		ae.add(13);
		ae.add(43);
		ae.add(22);
		ae.add(26);
		ae.add(20);
		System.out.println(ae);
	List<Integer> l=ae.stream().filter(i->i%2==0).collect(Collectors.toList());

	System.out.println(l);
	
	List<Integer> l1=ae.stream().map(i->i+5).collect(Collectors.toList());
	
	System.out.println(l1);
	
 long numCount=ae.stream().filter(i->i>20).count();
	
	System.out.println(numCount);
	}
}
