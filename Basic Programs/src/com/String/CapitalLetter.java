package com.String;

import java.util.Scanner;

public class CapitalLetter{
	   public static void main(String[] args)
	   {
		 /*  String s="welcome to India India";
		   System.out.println(s.endsWith("India"));*/
	      Scanner in = new Scanner(System.in);
	      //Uppercase
	      String isUp = "";
	      System.out.print("Please give a string: ");
	      String x = in.next();//SanDeeP
	      int z = x.length();
	      
	      for(int y = 0; y < z; y++)
	      {
	      
	    	  if(Character.isUpperCase(x.charAt(y))){
	            char w = x.charAt(y);
	            isUp = isUp + w + " ";
	         }
	      }
	      System.out.println("The uppercase characters are " + isUp);
	      //Uppercase
	   }
	}