package com.Collections;

import java.util.*;
class List_Iterator
{
 public static void main(String[] args)
 {
  ArrayList< String> ar = new ArrayList< String>();
  ar.add("ab");
  ar.add("bc");
  ar.add("cd");
  ar.add("de");
 
  System.out.println(ar);
  
 ListIterator litr = ar.listIterator();

  while(litr.hasNext())                 //In forward direction
  {
   System.out.println(litr.next()+" ");
  }
  while(litr.hasPrevious())  //de,cd,bc,ab         //In backward direction
  {
   String val=(String) litr.previous();
   if(val.equals("cd")){
	  // litr.set("capgemini");//de,cd,bc,ab-->capgemini
	   litr.add("capgemini123");
	   System.out.println(litr.next());
	   litr.previous();
   }else{
	   System.out.println(val);//de
   }

  }

 }
}