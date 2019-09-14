package com.pdw.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineArgs {
	public static void main(String[] args) throws IOException {
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Please enter your name? ");
		String name = reader.readLine();
		System.out.println("Your name is: " + name);
		System.out.println("please enter your details");
		String name1 = System.console().readLine();
		String age = args[1];
		System.out.println("Your details  are : " + args[1]);*/
		
		String name=args[0];
		String age=args[1];
		System.out.println("name and age is : "+name+"   "+age);
	}

}
