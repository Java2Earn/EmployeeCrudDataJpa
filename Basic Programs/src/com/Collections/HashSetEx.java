package com.Collections;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HashSetEx
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("welcome.txt");
		f.createNewFile();
		String s=f.getAbsolutePath();
		System.out.println(s);
		System.out.println("successs");
		long b=f.length();
		System.out.println(f.length()/1024);
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String name=sc.next();
		name +=sc.nextLine();
		
		System.out.println(name);*/
	}
	

}






//Comparable(I),Comparator(I)-->userdefined sorting order
//note:exept treeset and treemap every collection class will allow dissimilar type data
// treeset-->10,1,8,4,1,2-->ascending


