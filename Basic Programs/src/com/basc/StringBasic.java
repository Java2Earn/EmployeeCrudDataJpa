package com.basc;
public class StringBasic 
{
public static void main(String[] args) 
{
	String s="welcome";
	
	String s1=new String("ibm");
	String s2=new String("ibm");
	
	System.out.println(s1.equals(s2));//true
	System.out.println(s1==s2);//false
	
	StringBuffer sb=new StringBuffer("welcome");
	StringBuffer sb1=new StringBuffer("welcome");
	
	System.out.println(sb.equals(sb1));//false
	System.out.println(sb==sb1);//false
	
	String s4=sb.toString();
	String s5=sb1.toString();
	System.out.println(s4.equals(s5));
	
	
	
	/*String s2=new String("welcome");//scp,heap
	
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s==s1);
	
	System.out.println(s.equals(s2));
	System.out.println(s2==s1); 
	//compareTo
	System.out.println(s1.compareTo(s));
	System.out.println(s.length());
	System.out.println(s.trim().length());*/
	
		
	
}
}
