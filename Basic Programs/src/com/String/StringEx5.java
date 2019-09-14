package com.String;
public class StringEx5 
{
	public static void main(String[] args) {
		String s=new String("welcome");
	String s1=s.intern();//heap 
		
	System.out.println(s==s1);
			
		System.out.println(s1);
		System.out.println(s);
		String s2="ibm";
		String s3=s2.intern();
		System.out.println(s2==s3);
		System.out.println(s3);
		
		/*StringBuffer sb=new StringBuffer("ibm");
		StringBuffer sb1=new StringBuffer("ibm");
		System.out.println(sb.equals(sb1));
		
		
		String a=sb.toString();
		String b=sb1.toString();

		System.out.println(a.equals(b));*/
	}
}
