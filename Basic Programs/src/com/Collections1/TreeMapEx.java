package com.Collections1;
import java.util.TreeMap;
public class TreeMapEx 
{
	public static void main(String[] args) 

	{
		//upto 1.6 null key acceptable but not in latest versions.		
	TreeMap tr=new TreeMap();
	tr.put(1,"sandeep");
	tr.put(5,"srikanth1");
	tr.put(2,"srikanth");
	tr.put(4,"sri1");
	//tr.put("x","xyz");
	System.out.println(tr);
	}
}
