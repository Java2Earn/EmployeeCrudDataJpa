package com.Collections;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

   public static void main(String args[]) {
      
      Vector dayNames = new Vector();
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      
     System.out.println(dayNames);
     
     Enumeration days= dayNames.elements();
     
      while (days.hasMoreElements())//hasNext(); 
      {
         System.out.println(days.nextElement()); //next()
      }
   }
}