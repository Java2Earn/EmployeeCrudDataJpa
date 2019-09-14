package com.Collections;

import java.util.*;
class Test_Iterator
{
 public static void main(String[] args)
 {
  ArrayList<String> ar = new ArrayList<String>();
  ar.add("ab");
  ar.add("bc");
  ar.add("cd");
  ar.add("de");
System.out.println(ar);

 Iterator it = ar.iterator();     //Declaring Iterator
  while(it.hasNext())
  {  
	  Object as= it.next();
	  if(as.equals("ab"))
	  {
		  it.remove();
		  System.out.println("removed");
	  }else
	  {
		  System.out.println(as);
	  }
  }
 }
}