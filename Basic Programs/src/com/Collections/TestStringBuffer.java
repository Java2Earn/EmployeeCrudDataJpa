package com.Collections;

import java.util.TreeSet;

public class TestStringBuffer 
{
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new StringBuffer("welcome"));
	ts.add(new StringBuffer("hello"));
	ts.add(new StringBuffer("hai"));
	ts.add(new StringBuffer("hru"));
	System.out.println(ts);
	}
}

