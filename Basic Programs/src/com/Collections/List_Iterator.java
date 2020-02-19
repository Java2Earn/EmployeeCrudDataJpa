package com.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
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
   System.out.println(litr.next()+" ");//ab,bc,cd,de
  }
  while(litr.hasPrevious())  //de,cd,bc,ab         //In backward direction
  {
   String val=(String) litr.previous();
   if(val.equals("cd")){
	  // litr.set("capgemini");//de,cd,bc,ab-->capgemini
	   litr.add("capgemini123");
	   System.out.println(litr.next());//for printing
	   litr.previous();
   }else{
	   System.out.println(val);//de
   }}}}