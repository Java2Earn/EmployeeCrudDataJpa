package com.pdw.Basic;

import java.util.Random;

public class ArrayEx {

	public static void main(String[] args) {
	/*	int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i=0;i<5;i++)
			System.out.println(a[i]);*/
		
	Random r=new Random();
	
	int a[]=new int[20];
	
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=r.nextInt(100);
		}
	/*	for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		
		for(int i:a)
			System.out.println(i);
	}

}
