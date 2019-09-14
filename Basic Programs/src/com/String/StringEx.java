package com.String;

class StringEx {
	public static void main(String[] args) {

		String s = "abcdefgh";
		System.out.println(s.indexOf(97));
		s.split("");
		
		
		String s1 = "";

		System.out.println(s.indexOf("wel"));

		/*
		 * 
		 * if(s.substring(0,8).length()>0) { System.out.println(s);
		 * s=s.replaceFirst(s.substring(0,8), s1); System.out.println(s); }
		 */
		/*
		 * System.out.println(s.compareTo(s1));
		 * 
		 * System.out.println(s.hashCode()); System.out.println(s1.hashCode());
		 */

		/*
		 * String s2=new String("ibm");
		 * 
		 * 
		 * System.out.println(s.equals(s1)); System.out.println(s==s1);
		 * System.out.println(s==s2);
		 * 
		 * System.out.println(s.compareTo(s2));
		 * 
		 * System.out.println(s.equalsIgnoreCase(s1));
		 * 
		 * String s3="  welcome to ibm  "; System.out.println(s3.length());
		 * System.out.println(s3); System.out.println(s3.trim());
		 */
		String s5 = "wel";
		String s4 = new String("wel").intern();
		if (s4 == s5) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		String s2 = "aA";
		// String s="a";
		String s3 = new String("b");
		String s9 = new String("a");
		System.out.println(s.hashCode() + " " + s2.hashCode() + " "
				+ s3.hashCode() + " " + s4.hashCode());

		String qw = "ael";
		byte a[] = qw.getBytes();
		System.out.println(a[0]);
		System.out.println(s2.equals(s));
		System.out.println(s2.contentEquals(s));

		// System.out.println(s.hashCode()+"  "+s2.hashCode()+"  "+s3.hashCode());
		System.out.println(s3.codePointAt(0));
		System.out.println(s2.codePointAt(1));
		s2 = s2.concat("welcome");
		System.out.println(s2);

		/*
		 * String s=new String("ibm");
		 * System.out.println(s.hashCode()+"   "+s1.hashCode()
		 * +"  "+s2.hashCode()); System.out.println(s.toUpperCase());
		 * System.out.println(s.charAt(2));
		 * System.out.println(s.equalsIgnoreCase(s2));//TRUE
		 * System.out.println(s.equals(s1));
		 * System.out.println(s.equals(s2));//FALSE
		 * System.out.println(s.compareTo(s1));
		 * System.out.println(s.compareTo(s2)); System.out.println(s==s1);
		 * System.out.println(s==s2);//true
		 */
		/*
		 * StringBuffer s=new StringBuffer("welcome"); StringBuffer s2=new
		 * StringBuffer("welcome");
		 * 
		 * String s1=new String("ibm"); String s3=new String("ibm");
		 */

		/*
		 * System.out.println(s.equals(s2));//false
		 * System.out.println(s1.equals(s3));//true s.append(s1);
		 */
		/*
		 * System.out.println(s); System.out.println(s2.capacity());
		 * System.out.println(s2.length());
		 */

		/*
		 * StringBuilder s2=new StringBuilder("welcome"); String s3=new
		 * String("sandeep"); s2.append(s3); System.out.println(s2);
		 */
		/*
		 * String s2="abz"; System.out.println(s1); System.out.println(s);
		 * System.out.println(s.hashCode()); System.out.println(s1.hashCode());
		 * File f=new File("abc.txt"); System.out.println(f);
		 * System.out.println(s.equals(s1));//true
		 * System.out.println(s1.compareTo(s2));//1
		 * System.out.println(s2.compareTo(s1));//-1
		 * System.out.println(s==s1);//true
		 */

	}
}