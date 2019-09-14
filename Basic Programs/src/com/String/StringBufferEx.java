package com.String;

public class StringBufferEx {
	public static void main(String[] args) {
	
		
		StringBuffer s=new StringBuffer("Welcome");
		StringBuffer s1=new StringBuffer("welcome");
		
		System.out.println(s.equals(s1));
		
		
		String s3=s.toString();
		String s4=s1.toString();
		System.out.println(s3.equals(s4));
		
		
		
		
		
		
		
		
		
		
		
	/*	StringBuffer sb=new StringBuffer("welcome");
		StringBuffer sb1=new StringBuffer("welcome");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		
	String q=	sb.toString();
	String q1=	sb1.toString();
	System.out.println(q.equals(q1));
		*/
	/*	StringBuffer s = new StringBuffer("sandeep somavarapu");
		System.out.println(s);
		s.append(" From Hyderabad");
		System.out.println("APPEND ==> " + s);
		s.insert(0, "i am ");
		System.out.println("INSERT ==> " + s);
		System.out.println("INDEX ==> " + s.indexOf("Hyderabad"));
		s.replace(23, 32, "VIJAYAWADA");
		System.out.println("REPLAC ==> " + s);
		s.delete(0, 10);
		System.out.println("DELETE ==> " + s);
		System.out.println("Length ==> " + s.length());
		System.out.println("CAPACITY==> " + s.capacity());
		System.out.println("REVERSE ==> " + s.reverse());*/
	}
}