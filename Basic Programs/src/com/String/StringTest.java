package com.String;

public class StringTest 
{
public static void main(String[] args) 
{

	String s="a";
	String s1="a";
System.out.println(s==s1);

String s6=new String("x");
String s7=new String("x");
System.out.println(s6.equals(s7));
System.out.println(s6==s7);
	
	StringBuffer s2=new StringBuffer("ibm");
	StringBuffer s3=new StringBuffer("ibm");
	
	System.out.println(s2.equals(s3));
	
	String s4=s2.toString();
	String s5=s3.toString();
	
	
	System.out.println(s4.equals(s5));
	
	
	
	
	System.out.println(s.compareTo(s1));//0
	
	System.out.println(s.equals(s1));//false
	System.out.println(s==s1);
	
	
	System.out.println(s2==s3);
	System.out.println(s.equalsIgnoreCase(s1));
	
	
	
	
	
	
	
}
}
