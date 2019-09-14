package com.Collections;
import java.util.ArrayList;
class Contact
{
    String first_name;
    String last_name;
    String rank;
    public Contact(String fn,String ln,String rn) 
    {
    first_name = fn;
    last_name = ln;
    rank = rn;
    }
    public String toString()
    {
        return first_name+" "+last_name+"("+rank+")";
    }
}
public class PhoneBookUdo
{  
   public static void main(String[] args) 
   {
       Contact c1 = new Contact("Ricky", "Pointing","3");
       Contact c2 = new Contact("David", "Beckham","2");
       Contact c3 = new Contact("Virat", "Kohli","1");
    ArrayList< Contact> al = new ArrayList< Contact>();	
     al.add(c1);
     al.add(c2);
     al.add(c3);
     System.out.println(al);
   }
}
