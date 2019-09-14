package com.String;

public class StringMethodsDemo {
	public static void main(String[] args) {
		String targetString = "Java is fun to learn";
		String s1= "JAVA";
		String s2= "Java";
		String s3 = "  Hello Java  ";
		System.out.println("Char at index 2(third position): " + targetString.charAt(2));
		System.out.println("After Concat: "+ targetString.concat("-Enjoy-"));
		System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
		System.out.println("Checking equals with case: " +s2.equals(s1));
		System.out.println("Checking Length: "+ targetString.length());
		System.out.println("Replace function: "+ targetString.replace("java", ".net"));
		System.out.println("SubString of targetString: "+ targetString.substring(8));
		System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
		System.out.println("Converting to lower case: "+ targetString.toLowerCase());
		System.out.println("Converting to upper case: "+ targetString.toUpperCase());
		System.out.println("Triming string: " + s3.trim());
		System.out.println("searching s1 in targetString: " + targetString.contains(s1));
		System.out.println("searching s2 in targetString: " + targetString.contains(s2));

		char [] charArray = s2.toCharArray();
		System.out.println("Size of char array: " + charArray.length);
		System.out.println("Printing last element of array: " + charArray[3]);

	}

}










/*String s1=new String("hello");  
String s2="hello";  
String s3=s1.intern();//returns string from pool, now it will be same as s2  
System.out.println(s1==s2);//false because reference is different  
System.out.println(s2==s3);//true because reference is same  
*/ 
