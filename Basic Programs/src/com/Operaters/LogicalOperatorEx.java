package com.Operaters;

import java.util.Scanner;

//Java program to illustrate 
//logical operators 
public class LogicalOperatorEx 
{ 
	public static void main(String[] args) 
	{ 
		String x = "Sher"; 
		String y = "Locked"; 

		Scanner s = new Scanner(System.in); 
		System.out.print("Enter username:"); 
		String uuid = s.next(); 
		System.out.print("Enter password:"); 
		String upwd = s.next(); 

		// Check if user-name and password match or not. 
		if ((uuid.equals(x) && upwd.equals(y)) || 
				(uuid.equals(y) && upwd.equals(x))) { 
			System.out.println("Welcome user."); 
		} else { 
			System.out.println("Wrong uid or password"); 
		} 

	} 
} 



/*LOGICAL AND
------------
T  &  T  =>TRUE
T  &  F  =>FALSE
F  &  T  =>FALSE
F  &  F  =>FALSE

LOGICAL OR
-----------
T  &  T  =>TRUE
T  &  F  =>TRUE
F  &  T  =>TRUE
F  &  F  =>FALSE
*/