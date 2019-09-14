package com.Collections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate 
{

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your DOB in YYYY-MM-DD");
		String sdate=sc.next();
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD"); 
		Date date = (Date)formatter.parse(sdate);
		
		SimpleDateFormat newFormat = new SimpleDateFormat("MM-dd-yyyy");
		String finalString = newFormat.format(date);
		
		System.out.println(date);
		
		System.out.println(finalString);
		
		
		
		
		
	}
	
	
	
}
