package com;

import java.util.Scanner;

public class ScannerEx {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your id");
	int eid=sc.nextInt();
	System.out.println("enter your name");
	String name=sc.nextLine();
	System.out.println(name);

	
	System.out.println(eid+" "+name );
	
}
}
