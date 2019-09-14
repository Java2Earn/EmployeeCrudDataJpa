package com.Collections;

import java.util.ArrayList;

public class ArrayListEx1 
{
public static void main(String[] args) 
{
	ArrayList ae=new  ArrayList();
	ae.add("qwerty");
	ae.add("sandeep");
	ae.add("welcome");
	ae.add("hello");
	ae.add(1,"as");
	ae.remove("as");
	System.out.println(ae);
	/*System.out.println(ae.lastIndexOf("hello"));
	System.out.println(ae.indexOf("hello"));*/
	ArrayList ae1=new ArrayList();
	ae1.add(1);
	ae1.addAll(0,ae);
	System.out.println(ae1);
	//ae1.removeAll(ae);
		ae1.retainAll(ae);
	System.out.println(ae1);//
	//System.out.println(ae);
/*ae.add("a");
	ae.add("c");
	ae.add(1);
	ae.add(2,"sandeep");
	System.out.println(ae);
	//System.out.println(ae.size());
	ArrayList ae1=new  ArrayList();
	ae1.add("x");
	ae1.add("y");
	ae1.add("z");
	ae.addAll(ae1);
	System.out.println(ae);
	
	ae.retainAll(ae1);
	
	System.out.println(ae);//ac 1 sabdee
	*/
	
	
	
	
	
}	
}
