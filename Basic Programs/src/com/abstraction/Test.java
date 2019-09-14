package com.abstraction;

public class Test {

	public static void main(String[] args) {
	String s="welcome";
	String s1="welcome";
	s=s.concat("to ibm");
	
	System.out.println(s);
	
	String s2=new String("welcome"); 
	String s3=new String("welcome"); 
	
	System.out.println(s.equals(s1));//T
	System.out.println(s==s1);//T
	System.out.println(s==s2);//F
	System.out.println(s.equals(s2));//T
	System.out.println(s2==s3);
	}

}
