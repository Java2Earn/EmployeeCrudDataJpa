package com;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListEx 
{

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		al.add(11);
		System.out.println(al.size());
		al.ensureCapacity(12);
		al.trimToSize();
		System.out.println(al.size());
		
		
	}

}
